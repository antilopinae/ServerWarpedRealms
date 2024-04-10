package adapters.grpc

import adapters.grpc.dao.RequestMessage
import adapters.grpc.dao.ResponseMessage
import adapters.grpc.server.GRpcServer
import adapters.grpc.server.dao.Observer
import java.util.concurrent.ConcurrentLinkedQueue

class GRpcLayer {
    val server = GRpcServer()
    init {
        server.start()
    }
    val connector = server.connector
    fun sendResponses(clientPac: ConcurrentLinkedQueue<Pair<Observer, ResponseMessage>>){
        connector.sendResponses(clientPac)
    }
    fun getRequests(): ConcurrentLinkedQueue<Pair<Observer, RequestMessage>> {
        return connector.getRequests()
    }
    fun stopConnection(){
        server.stopConnection()
    }
}
