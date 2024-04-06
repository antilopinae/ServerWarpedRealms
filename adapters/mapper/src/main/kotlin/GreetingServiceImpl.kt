package adapters.mapper.grpc.server

import com.grpc.GreetingServiceGrpc
import com.grpc.GreetingServiceOuterClass
import io.grpc.stub.StreamObserver

class GreetingServiceImpl: GreetingServiceGrpc.GreetingServiceImplBase() {
    override fun greeting(
        request: GreetingServiceOuterClass.HelloRequest,
        responseObserver: StreamObserver<GreetingServiceOuterClass.HelloResponse>
    ) {
        super.greeting(request, responseObserver)
        print(request)
        val response = GreetingServiceOuterClass.HelloResponse.newBuilder()
            .setGreeting("Hello from server ${request.name}!")
            .build()
        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }
}
