package adapters.mapper.grpc.server

import com.grpc.GreetingServiceGrpc
import com.grpc.GreetingServiceOuterClass
import com.grpc.HelloRequest
import com.grpc.HelloResponse
import io.grpc.stub.StreamObserver

class GreetingServiceImpl: GreetingServiceGrpc.GreetingServiceImplBase() {
    val observes: LinkedHashSet<StreamObserver<HelloResponse>> = linkedSetOf()
    override fun greeting(responseObserver: StreamObserver<HelloResponse>?): StreamObserver<HelloRequest> {
        observes.add(responseObserver!!)
        return object: StreamObserver<HelloRequest>{
            override fun onNext(p0: HelloRequest?) {
                // receiving the data from client
                println("${p0!!}")
                val msg = HelloResponse.newBuilder()
                    .setGreeting("Hello from server ${p0!!.name}!!")
                    .build()
                observes.stream().forEach {
                    it.onNext(msg)
                }
            }

            override fun onCompleted() {
                observes.remove(responseObserver)
            }

            override fun onError(p0: Throwable?) {
                observes.remove(responseObserver)
            }
        }
//        return super.greeting(responseObserver)
    }
//    override fun greeting(
//        request: HelloRequest,
//        responseObserver: StreamObserver<HelloResponse>
//    ) {
//        //super.greeting(request, responseObserver)
//        println(request)
//        for(i in 0..1000){
//            Thread.sleep(100)
//            val response = HelloResponse.newBuilder()
//                .setGreeting("Hello from server ${request.name}!")
//                .build()
//            responseObserver.onNext(response)
//        }
//        responseObserver.onCompleted()
//    }
}
