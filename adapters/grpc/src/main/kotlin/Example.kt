package adapters.grpc.server

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Example {
    suspend fun eventHandlerBuilder1() =
        runBlocking {
            launch(Dispatchers.IO, CoroutineStart.LAZY)
            {

        }
    }
}
