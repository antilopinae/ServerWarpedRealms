fun main() {
    System.setProperty("io.ktor.development", "true")

    val grpc = Thread{
        val serverConnector = ServerConnector()
        val grpc_builder = GRpcBuilder(serverConnector)
    }
    grpc.start()

    val ktor = Thread{
        val ktor_builder = KtorBuilder()
        ktor_builder.start()
    }
    ktor.start()

    val game_logic = Thread{
        val game_logic_builder = ServerGameLogicBuilder()
        game_logic_builder.Start()
    }
    game_logic.start()
}
