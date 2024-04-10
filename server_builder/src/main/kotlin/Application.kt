import server_logic.ServerGameLogic
import server_logic.ServerGameLogicBuilder

fun main() {
    System.setProperty("io.ktor.development", "true")

    val serverConnector = ServerConnector()

    val grpc = Thread{
        val grpc_builder = GRpcBuilder(serverConnector)
    }
    grpc.start()

    val ktor = Thread{
        val ktor_builder = KtorBuilder(serverConnector)
        ktor_builder.start()
    }
    ktor.start()

    val game_logic = ServerGameLogicBuilder(serverConnector)
}
