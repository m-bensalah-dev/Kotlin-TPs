enum class OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
class Order(var status:OrderStatus){
    fun nextStatus(){
        when(status){
            OrderStatus.PENDING -> OrderStatus.SHIPPED
            OrderStatus.SHIPPED -> OrderStatus.DELIVERED
            else -> status
        }
    }
}
fun main() {
    val order = Order(OrderStatus.PENDING)
    println("Current status: ${order.status}")

    order.nextStatus()
    println("Updated status: ${order.status}")

    order.nextStatus()
    println("Updated status: ${order.status}")
}
