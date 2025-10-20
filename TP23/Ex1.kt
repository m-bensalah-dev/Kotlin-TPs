open class Paiment(){
    open fun payer(){
        println("Paiment a travers le class Paiment.")
    }
}
class CarteDeCredit():Paiment(){
    override fun payer() {
        println("Paiment par carte de credit.")
    }
}
class PayPal():Paiment(){
    override fun payer() {
        println("Paiment par PayPal.")
    }
}
fun main(){
    val paiment = Paiment()
    val paiement1 = CarteDeCredit()
    paiement1.payer()
    val paiement2 = PayPal()
    paiement2.payer()
}
