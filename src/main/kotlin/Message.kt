data class Message(
    val id: Int,
    val ownerId: Int,
    val message: String,
    var isRead: Boolean = false
)