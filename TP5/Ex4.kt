data class Product(val name: String, val price: Double, val quantity: Int)

fun calculerPrixTotal(list: List<Product>): Double {
    var total = 0.0
    for (produit in list) {
        total += produit.price * produit.quantity
    }
    return total
}

fun afficherDetails(product: Product) {
    println("Name: ${product.name}, Price: ${product.price}, Quantity: ${product.quantity}")
}

fun main() {
    val produit1 = Product("tablette", 1500.0, 22)
    val produit2 = Product("Samsung Ultra plus", 4000.0, 40)
    val produit3 = Product("smart watch", 2500.0, 10)

    val monList: List<Product> = listOf(produit1, produit2, produit3)
    println(calculerPrixTotal(monList))
    println("---------------------------------")
    afficherDetails(produit1)
    afficherDetails(produit2)
    afficherDetails(produit3)
}
