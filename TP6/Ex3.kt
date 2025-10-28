data class Produit(
    val nom: String,
    val prix: Double,
    val quantite: Int,
    val description: String
)

fun main() {
    val produit1 = Produit("Dell", 3000.0, 44, "PC for work")
    println(produit1.toString())

    val produit2 = produit1.copy(prix = 6000.0)
    println(produit2.toString())

    println(produit1.equals(produit2))
}
