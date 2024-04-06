package adapters.mapper.grpc.server

import io.grpc.Server
import io.grpc.ServerBuilder

class GRpcServer {
    val server: Server = ServerBuilder.forPort(8081)
        .addService(GreetingServiceImpl())
        .build()
    fun start(){
        server.start()
        println("GRPC Server started")
        server.awaitTermination()
    }
}
