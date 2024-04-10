package server_logic

import adapters.grpc.dao.RequestMessage
import adapters.grpc.dao.ResponseMessage
import com.badlogic.gdx.physics.box2d.World
import ktx.assets.disposeSafely
import ktx.box2d.createWorld
import ktx.math.vec2

// Игровая логика: game Loop и обработка событий, физика

class ServerGameLogic
{
//    val physicSystem = ServerPhysicSystem(phWorld)
    fun Update(delta: Float){
        println("[SERVER]=====================")
//        physicSystem.onUpdate(delta)
        TODO()
    }
    fun dispose() {
        phWorld.disposeSafely()
    }
    companion object {
        val phWorld: World = createWorld(gravity = vec2()).apply {
            setAutoClearForces(false)
        }
    }
}
