import server_logic.server.ServerGameLogicController

class ServerGameLogicBuilder
{
    private val game_logic = ServerGameLogicController()
    init {
        println("Game logic started")
    }
    fun Start(){
        game_logic.CreateGameLogicRoom()
    }
    fun Stop() {
        TODO()
    }
}
