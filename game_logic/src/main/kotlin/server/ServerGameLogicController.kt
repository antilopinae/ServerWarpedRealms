package server_logic.server

import ServerConnector

class ServerGameLogicController(
) {
    private val gameLogicRooms: MutableList<ServerGameLogicRoom> = mutableListOf()

    fun CreateGameLogicRoom(){
        gameLogicRooms.add(createGameLogicRoom())
    }
    private fun createGameLogicRoom(): ServerGameLogicRoom {
        return ServerGameLogicRoom()
    }
    private fun stopGameLogicRoom(id: Int){
        gameLogicRooms[id].StopRoom()
    }
    private fun stopGameLogicRoom(room: ServerGameLogicRoom){
        gameLogicRooms[gameLogicRooms.indexOf(room)]
    }
    private fun stopAllGameLogicRooms(){
        gameLogicRooms.forEach { it.StopRoom() }
    }
}
