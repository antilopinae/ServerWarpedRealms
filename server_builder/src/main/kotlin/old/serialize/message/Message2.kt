package old.serialize.message

import old.serialize.IMessage
import old.serialize.MessageType
import java.nio.ByteBuffer

// Пример класса для второго типа сообщения
data class Message2(val value: Int) : IMessage {
    override fun serialize(): ByteArray {
        val buffer = ByteBuffer.allocate(8)
        buffer.putInt(MessageType.MESSAGE_TYPE_2.value.toInt())
        buffer.putInt(value)
        return buffer.array()
    }

    companion object {
        fun deserialize(bytes: ByteArray): Message2 {
            val buffer = ByteBuffer.wrap(bytes)
            buffer.int // Skip message type
            val value = buffer.int
            return Message2(value)
        }
    }
}
