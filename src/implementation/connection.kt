package implementation

enum class Connection {
    Error,
    Disconnected,
    Connected,
}

data class Device(
    val name: String,
    val connection: Connection
)

fun checkConnection() {
    val devices = listOf(
        Device("AirPods", Connection.Disconnected),
        Device("Apple Watch", Connection.Error),
        Device("AirPods Pro", Connection.Connected),
    )

    for (device in devices) {
        when (device.connection) {
            Connection.Connected -> println("Connected to ${device.name}")
            Connection.Disconnected -> println("Disconnected to ${device.name}")
            Connection.Error -> println("Error to ${device.name}")
        }
    }
}