sealed class Payment(open val amount: Double)

class CashPayment(override val amount: Double, val placeOfPayment: String) : Payment(amount)
class CardPayment(override val amount: Double, val cardType: String) : Payment(amount)
class DigitalPayment(override val amount: Double, val platformOfPayment: String) : Payment(amount)

fun typeDePaiement(payment: Payment) {
    when (payment) {
        is CashPayment -> println("Cash Payment: Amount = ${payment.amount}, Place = ${payment.placeOfPayment}")
        is CardPayment -> println("Card Payment: Amount = ${payment.amount}, Card Type = ${payment.cardType}")
        is DigitalPayment -> println("Digital Payment: Amount = ${payment.amount}, Platform = ${payment.platformOfPayment}")
    }
}

fun main() {
    val cashPayment1 = CashPayment(3000.0, "Rabat")
    val cardPayment1 = CardPayment(250.0, "CIH Bank")
    val digitalPayment1 = DigitalPayment(500.0, "PayPal")

    typeDePaiement(cashPayment1)
    typeDePaiement(cardPayment1)
    typeDePaiement(digitalPayment1)
}
