class Box(val size: String) {
    class Item(val name: String, val box: Box) {
        fun printDetails() {
            println("Item $name is in Box of size ${box.size}")
        }
    }
}

fun main() {

    val myBox = Box("Large")
    val myItem = Box.Item("Book",myBox)
    myItem.printDetails()
    
}
