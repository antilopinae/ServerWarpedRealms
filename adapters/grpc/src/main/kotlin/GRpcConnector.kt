package adapters.grpc.server

import adapters.grpc.dao.RequestMessage
import adapters.grpc.dao.ResponseMessage
import adapters.grpc.server.dao.Observer
import com.grpc.HelloResponse
import com.grpc.PlayerPosition
import io.grpc.stub.StreamObserver
import java.util.concurrent.ConcurrentLinkedQueue

class GRpcConnector {
    val observers: LinkedHashSet<StreamObserver<HelloResponse>> = linkedSetOf()

    val request_messages: ConcurrentLinkedQueue<Pair<Observer, RequestMessage>> = ConcurrentLinkedQueue()
    fun getMessage(observer: StreamObserver<HelloResponse>, request: RequestMessage){
        request_messages.add(mapObserver(observer) to request)
        //client sent some message lets add it to queue
        //some actions here
        sendResponses()
    }
    fun sendResponses(clientPack: ConcurrentLinkedQueue<Pair<Observer, ResponseMessage>>){
        clientPack.stream().forEach {
            it.first.observer.onNext(mapResponse(it.second))
        }
    }
    fun getRequests(): ConcurrentLinkedQueue<Pair<Observer, RequestMessage>>{
        return request_messages
    }
    fun sendResponses(){
        val msg = HelloResponse.newBuilder()
            .setToken("jajajajaj")
            .addPositions(
                PlayerPosition.newBuilder()
                    .setPlayer("You")
                    .setPositionX(3f)
                    .setPositionY(2f)
                    .build()
            )
            .addPositions(
                PlayerPosition.newBuilder()
                    .setPlayer("Other player1")
                    .setPositionX(2f)
                    .setPositionY(3f)
                    .build()
            )
            .addPositions(
                PlayerPosition.newBuilder()
                    .setPlayer("Other player2")
                    .setPositionX(4f)
                    .setPositionY(2f)
                    .build()
            )
            .addPositions(
                PlayerPosition.newBuilder()
                    .setPlayer("Other player3")
                    .setPositionX(10f)
                    .setPositionY(4f)
                    .build()
            )
            .build()
        observers.forEach{ it.onNext(msg) }
    } //send to all observers
    fun removeObserver(observer: StreamObserver<HelloResponse>){
        observers.remove(observer)
    }
    fun addObserver(observer: StreamObserver<HelloResponse>){
        observers.add(observer)
    }
    fun mapObserver(observer: StreamObserver<HelloResponse>): Observer {
        return Observer(observer)
    }
    fun mapResponse(response: ResponseMessage): HelloResponse {
        val response = HelloResponse.newBuilder()
//            .setToken(p0.token)
            .addPositions(
                PlayerPosition.newBuilder()
                    .setPlayer("You")
                    .setPositionX(3f)
                    .setPositionY(2f)
                    .build()
            )
            .addPositions(
                PlayerPosition.newBuilder()
                    .setPlayer("Other player1")
                    .setPositionX(2f)
                    .setPositionY(3f)
                    .build()
            )
            .addPositions(
                PlayerPosition.newBuilder()
                    .setPlayer("Other player2")
                    .setPositionX(4f)
                    .setPositionY(2f)
                    .build()
            )
            .addPositions(
                PlayerPosition.newBuilder()
                    .setPlayer("Other player3")
                    .setPositionX(10f)
                    .setPositionY(4f)
                    .build()
            )
            .build()
        return response
    }
}
