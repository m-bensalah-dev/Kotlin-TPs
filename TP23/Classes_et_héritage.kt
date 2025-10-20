
open class Paiement {
    open fun payer() {
        println("Paiement depuis la classe Paiement.")
    }
}
class CarteDeCredit : Paiement() {
    override fun payer() {
        println("Paiement par carte de crédit.")
    }
}

class PayPal : Paiement() {
    override fun payer() {
        println("Paiement par PayPal.")
    }
}

fun main() {
    val paiement1: Paiement = Paiement()
    val paiement2: Paiement = CarteDeCredit()


    paiement1.payer()
    paiement2.payer()
}
