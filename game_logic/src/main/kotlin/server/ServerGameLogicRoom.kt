package server_logic.server

import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.locks.ReentrantLock

class ServerGameLogicRoom
{
    private val roomsPhysicLogic: ConcurrentLinkedQueue<ServerGameLogic> = ConcurrentLinkedQueue()

    private val lockGameLogic = ReentrantLock().also { it.lock() }

    private val threadGameLogic = Thread{
        val serverGameLogic = ServerGameLogic()

        while(lockGameLogic.isLocked){
            //do some logic
        }
    }
    fun StartRoom(){
        if(!lockGameLogic.isLocked) lockGameLogic.lock()
        threadGameLogic.start()
    }
    fun StopRoom(){
        roomsPhysicLogic.stream().forEach {
            it.StopPhysic()
        }
        //count results
        // lock rooms
        roomsPhysicLogic.stream().forEach {
            it.CleanGameLogic()
        }
        //clean all
    }
    private fun createPhysicRoom(){
    }
    private fun stopPhysicRoom(){
        if(lockGameLogic.isLocked) lockGameLogic.unlock()
        threadGameLogic.join()
    }
}
