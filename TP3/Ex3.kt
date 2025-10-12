open class Vehicule(val marque: String){
    init {
        println("Message d'apres la class Vehicule.")
    }
}
class Voiture(marque: String,val nombrePortes:Int):Vehicule(marque){
    init {
        println("Message d'apres la class Voiture.")
    }
    fun afficherDetails(){
        println("Marque: $marque,Nombre de portes: $nombrePortes")
    }
}
class Camion(marque:String,val capaciteCharge: String):Vehicule(marque){
    init {
        println("Message d'apres la class Camion.")
    }
    fun afficherDetails(){
        println("Marque: $marque,Capacite de charge: $capaciteCharge")
    }
}
fun main(){

    val voiture1 = Voiture("Mercedes",4)
    voiture1.afficherDetails()

    val camion1 = Camion("MAN","20T")
    camion1.afficherDetails()
}
