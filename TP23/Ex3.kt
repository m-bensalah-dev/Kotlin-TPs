interface Reparable{
    fun reparer()
}
class Voiture():Reparable{
    override fun reparer() {
        println("Ce voiture est reparable.")
    }
}
class Ordinateur():Reparable{
    override fun reparer() {
        println("L'ordinatue est reparable.")
    }
}
fun main(){
    val voiture1 = Voiture()
    val ordinateur1 = Ordinateur()
    voiture1.reparer()
    ordinateur1.reparer()
}
