import org.junit.Test

import org.junit.Assert.*

class ChatServiceTest {

    @Test
    fun getChatsTest() {
        var chats = ChatService
        val user1Id = 1
        val user2Id = 2
        val text = "1"

        val result = chats.sendMessage(user1Id, user2Id, text)

    }

    @Test
    fun setChats() {
    }

    @Test
    fun getId() {
    }

    @Test
    fun setId() {
    }

    @Test
    fun sendMessage() {
    }

    @Test
    fun testGetChats() {
    }

    @Test
    fun readChat() {
    }

    @Test
    fun getUnreadChatsCount() {
    }

    @Test
    fun deleteChat() {
    }

    @Test
    fun editMessage() {
    }

    @Test
    fun deleteMessage() {
    }
}