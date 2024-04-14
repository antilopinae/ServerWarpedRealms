package server_logic.server

import com.badlogic.gdx.maps.tiled.TmxMapLoader
import dao.GamePackage
import dao.GamePackageMapper
import dao.mapper.EntityMapperController
import generated.systems.Factories
import generated.systems.Systems
import generated.systems.injectSys
import warped.realms.event.MapChangeEvent
import warped.realms.system.Logger
import warped.realms.system.SpawnSystem
import warped.realms.system.debug
import warped.realms.system.update.CameraSystem
import warped.realms.system.update.CollisionSpawnSystem
import warped.realms.system.update.RenderSystem

// Игровая логика: game Loop и обработка событий, физика
class ServerGameLogic
{
    private val factories = Factories()
    val systems by lazy {
        Systems(factories)
    }

    val entityMapperController = EntityMapperController(systems)

    private val titledMap = TmxMapLoader().load("map/map_1.tmx")

    private val mapChangeEvent = MapChangeEvent(
        titledMap,
        injectSys<RenderSystem>(systems),
        injectSys<SpawnSystem>(systems),
        injectSys<CameraSystem>(systems),
        injectSys<CollisionSpawnSystem>(systems)
    )
    fun Start(){
        Logger.debug { "Game screen shown" }
        mapChangeEvent.onTick()
    }
    fun Update(delta: Float){
        systems.Update(delta)
    }
    fun StopPhysic() {
        //count results
        TODO()
    }
    fun CleanGameLogic(){
        systems.Dispose()
    }
    companion object{
        const val UNIT_SCALE = 1 / 24f
    }
}
