interface Reparable{
    fun reparer()
}
class Voiture():Reparable{
    override fun reparer() {
        println("Voiture reparable")
    }
}
class Ordinateur():Reparable{
    override fun reparer() {
        println("Ordinateur reparable")
    }
}
fun main(){
    val voiture1 = Voiture()
    voiture1.reparer()
    val ordinateur = Ordinateur()
    ordinateur.reparer()

}
