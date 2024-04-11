package warped.realms.system.update.mapper

import ServerConnector
import Update
import System
import generated.systems.Factories
import generated.systems.Systems
import generated.systems.injectSys
import warped.realms.entity.mapper.EntityMapper
import warped.realms.event.EntityDespawnEvent
import warped.realms.event.EntitySpawnEvent
import warped.realms.system.SpawnSystem
import warped.realms.system.entityType

@System
@Update(9)
class ServerDismapperSystem(
    val systems: Systems,
    val factories: Factories
) {
    private val entityMappers = mutableListOf<EntityMapper>()
    lateinit var serverConnector: ServerConnector

    val spawnEntityEvent: EntitySpawnEvent by lazy {
        EntitySpawnEvent(entityType.PLAYER, injectSys<SpawnSystem>(systems))
    }
    val despawnEntityEvent: EntityDespawnEvent by lazy {
        EntityDespawnEvent(entityType.PLAYER, injectSys<SpawnSystem>(systems))
    }
    fun PutComponent(cmp: EntityMapper) {
        entityMappers.add(cmp)
    }
    fun Update(delta: Float) {
//        val response = serverConnector.getResponse()
//
//        println(response.positions.size)
//
//        for(i in 0..response.positions.size-1){
//            if(entityMappers.size>i){
//                entityMappers[i].dismapEntity(ResponseDismapper(response.positions.toList()[i].second))
//            }
//            else{
//                if(!spawnEntityEvent.lock.isLocked){
//                    spawnEntityEvent.lock.lock()
//                    spawnEntityEvent.onTick()
//                    if(!spawnEntityEvent.lock.isLocked){
//                        entityMappers[i].dismapEntity(ResponseDismapper(response.positions.toList()[i].second))
//                        println("spawn and dismap new entity")
//                    }
//                }
//            }
//        }
    }
    fun Dispose() {
        entityMappers.clear()
    }
}
