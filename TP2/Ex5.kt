open class Vehicule(val marque: String,val modele: String){
    open fun afficher_details(){
        println("Marque: $marque,Modele: $modele")
    }
    open fun se_deplace(){
        println("Vehicule se deplace")
    }
}
// Class Avion
class Avion(marque:String,modele:String,val ailes:Int,val nbrRoues:Int):Vehicule(marque,modele){
    override fun afficher_details() {
        super.afficher_details()
        println("Ailes: $ailes,Nombre de rous: $nbrRoues")
    }

    override fun se_deplace() {
        println("Ce vehicule se deplace en voler.")
    }
}
class Voiture(marque: String, modele: String,val annee: Int, val nbrRoues: Int):Vehicule(marque,modele){
    override fun afficher_details() {
        super.afficher_details()
        println("Annee: $annee,Nombre de rous: $nbrRoues")
    }

    override fun se_deplace() {
        println("Ce vehicule se deplace en rouler.")
    }
}
class Velo(marque: String,modele: String,val nbrRoues: Int):Vehicule(marque, modele){
    override fun afficher_details() {
        super.afficher_details()
        println("Nombre de rous: $nbrRoues")
    }

    override fun se_deplace() {
        println("Ce vehicule se deplace en rouler.")
    }
}
fun main(){
    val avion1 = Avion("Airbus", "A320", 180, 2)
    val avion2 = Avion("Boeing", "747", 400, 4)
    val avion3 = Avion("Cessna", "172 Skyhawk", 4, 1)
    var avionList = mutableListOf<Avion>(avion1,avion2,avion3)
    avionList.forEach { item -> item.afficher_details() ; item.se_deplace() ; println("-------------") }

    val voiture1 = Voiture("Mercedes", "Benz", 2016, 4)
    val voiture2 = Voiture("BMW", "X5", 2019, 5)
    val voiture3 = Voiture("Toyota", "Corolla", 2020, 4)
    var voitureList = mutableListOf<Voiture>(voiture1,voiture2,voiture3)
    voitureList.forEach { it -> it.afficher_details() ; it.se_deplace() ; println("-------------")}

    val velo1 = Velo("VTT", "montagne", 2)
    val velo2 = Velo("Route", "plat", 2)
    val velo3 = Velo("Ville", "urbain", 2)
    val veloList = mutableListOf<Velo>(velo1,velo2,velo3)
    veloList.forEach { it -> it.afficher_details() ; it.se_deplace(); println("-------------") }

}
