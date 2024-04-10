package adapters.grpc.server

import io.grpc.Server
import io.grpc.ServerBuilder
import io.ktor.utils.io.errors.*
import java.util.concurrent.Executors

class GRpcServer {
    val connector = GRpcConnector()
    val controller = GRpcController(connector)
    val server: Server = ServerBuilder.forPort(8000)
        .executor(Executors.newCachedThreadPool())
        .addService(controller)
        .build()
    fun start(){
        try {
            server.start()
        } catch (e: IOException){
            println("Exception on grpc server started")
        }
        println("GRPC Server started")
        try {
            server.awaitTermination()
        } catch(e: InterruptedException){
            println("Interrupted exception catch")
        }
    }
    fun stopConnection(){
        TODO()
    }
}
