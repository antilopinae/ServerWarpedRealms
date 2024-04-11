package server_logic.server

import com.badlogic.gdx.maps.tiled.TmxMapLoader
import dao.GamePackage
import dao.GamePackageMapper
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
class ServerGameLogic: Thread()
{
    private val factories = Factories()
    private val systems = Systems(factories)
    private val gamePackageMapper = GamePackageMapper()

    private val titledMap = TmxMapLoader().load("map/map_1.tmx")

    private val mapChangeEvent = MapChangeEvent(
        titledMap,
        injectSys<RenderSystem>(systems),
        injectSys<SpawnSystem>(systems),
        injectSys<CameraSystem>(systems),
        injectSys<CollisionSpawnSystem>(systems)
    )

    override fun start() {
        super.start()
    }

    override fun run() {
        super.run()
    }

    override fun clone(): ServerGameLogic {
        return ServerGameLogic()
    }

    fun Start(){
        Logger.debug { "Game screen shown" }
        mapChangeEvent.onTick()
    }
    fun GetPackage(): GamePackage{
        val gamePackage = gamePackageMapper.MapGamePackage()
        return gamePackage
    }
    fun SetPackage(gamePackage: GamePackage){
        gamePackageMapper.UnmapGamePackage(gamePackage)
    }
    fun Update(delta: Float){
        systems.Update(delta)
    }
    private fun resolvePackages(main_package: GamePackage, local_package: GamePackage){
        gamePackageMapper.ResolveGamePackage(main_package, local_package)
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
