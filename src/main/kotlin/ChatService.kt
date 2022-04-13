object ChatService {
    var chats = mutableListOf<Chat>()
    var id = 1

    fun sendMessage(user1Id: Int, user2Id: Int, text: String) {
        val message = Message(1, user1Id, text)
        val newChat = chats.filter { chat ->
            chat.users.containsAll(listOf(user1Id, user2Id))
        }
            .firstOrNull()
            .let { chat ->
                chat?.copy(messages = chat.messages + message)
            } ?: Chat(
            id = 1,
            listOf(user1Id, user1Id),
            listOf(message)
        )
        chats.removeIf { newChat.id == it.id }
        chats.add(newChat)
    }

    fun getChats(userId: Int) {

        val x = chats.filter { chat ->
            chat.users.contains(userId)
        }.forEach { chat ->
            chat.messages.forEach {
                it.isRead = true
            }

        }

    }

    fun readChat(chatId: Int) {
        chats.forEach() { chat ->
            if (chat.id == chatId) chat.messages.forEach() {
                it.isRead = true
            }

        }
    }

    fun getUnreadChatsCount(userId: Int) {
        chats.count { chat ->
            chat.users.contains(userId)
        }
    }

    fun deleteChat(chatId: Int) {
        var x = chats.filter { chat ->
            chat.id == chatId
        }
        x.forEach() {chat ->
            chat.id = null
            chat.users = emptyList()
            chat.messages = emptyList()
        }
    }
    fun editMessage(chatId: Int, messageId: Int, text: String) = chats.filter { chat ->
        chat.id == chatId
    }.forEach { chat ->
       chat.messages.filter { message ->
           message.id == messageId
       }.forEach { message ->
       message.message = text
       }

       }
    }



