package old.serialize

import old.serialize.message.Message1
import old.serialize.message.Message2
import java.nio.ByteBuffer

interface IMessage {
    fun serialize(): ByteArray

    companion object {
        fun deserialize(bytes: ByteArray): IMessage {
            val buffer = ByteBuffer.wrap(bytes)
            val type = buffer.int
            return when (type) {
                MessageType.MESSAGE_TYPE_1.value.toInt() -> Message1.deserialize(bytes)
                MessageType.MESSAGE_TYPE_2.value.toInt() -> Message2.deserialize(bytes)
                // Добавляем обработку других типов сообщений по аналогии
                else -> throw IllegalArgumentException("Unknown message type: $type")
            }
        }
    }
}
