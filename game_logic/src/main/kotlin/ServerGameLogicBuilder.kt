package server_logic

import ServerConnector
import java.util.concurrent.locks.ReentrantLock

class ServerGameLogicBuilder(
    val serverConnector: ServerConnector
) {
    val lockGameLogic = ReentrantLock().also { it.lock() }

    val threadGameLogic = Thread{
        val serverGameLogic = ServerGameLogic()

        while(lockGameLogic.isLocked){
            //do some logic
        }
    }

    //    fun sendResponses(clientPac: ConcurrentLinkedQueue<Pair<Observer, ResponseMessage>>){
//        connector.sendResponses(clientPac)
//    }
//    fun getRequests(): ConcurrentLinkedQueue<Pair<Observer, RequestMessage>> {
//        return connector.getRequests()
//    }

    fun startGameLogic(){
        if(!lockGameLogic.isLocked) lockGameLogic.lock()
        threadGameLogic.start()
    }
    fun stopGameLogic(){
        if(lockGameLogic.isLocked) lockGameLogic.unlock()
        threadGameLogic.join()
    }
}
