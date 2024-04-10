import adapters.grpc.GRpcLayer
import adapters.grpc.dao.RequestMessage
import adapters.grpc.dao.ResponseMessage
import adapters.grpc.server.dao.Observer
import adapters.rest_api.KtorLayer
import java.util.concurrent.ConcurrentLinkedQueue


//Подключение к серверу, передача событий.
class ServerConnector() {
    val grpcLayer = GRpcLayer()
    val ktorLayer = KtorLayer()
    init {
        println("==========Server To Start==========")
    }
    fun sendResponse(p: ConcurrentLinkedQueue<Pair<Observer, ResponseMessage>>) {
        grpcLayer.sendResponses(p)
    }
    fun getRequests():ConcurrentLinkedQueue<Pair<Observer, RequestMessage>>  {
        return grpcLayer.getRequests()
    }
    fun dispose() {
        grpcLayer.stopConnection()
    }
}
