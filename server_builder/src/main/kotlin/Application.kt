import adapters.mapper.grpc.server.GRpcServer
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    System.setProperty("io.ktor.development", "true")
    val server = GRpcServer()
    server.start()
    embeddedServer(Netty, port = 8080) {
        module()
    }.start(wait = true)
}

lateinit var str: String

//val usersQueue = ConcurrentLinkedQueue<UserSession>()
//val rooms = ConcurrentHashMap<String, Room>()
//val channels = ConcurrentHashMap<String, Channel<String>>()

//application structuring
fun Application.module() =
    routing {
        get("/"){
            call.respond("Hello world")
        }
    }
