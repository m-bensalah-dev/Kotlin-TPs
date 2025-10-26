interface Vehicule {
    var marque: String
    fun demarrer()
    fun arreter()
}

open class VehiculeBase(override var marque: String) : Vehicule {
    override fun demarrer() {
        println("Le véhicule $marque démarre")
    }

    override fun arreter() {
        println("Le véhicule $marque s'arrête")
    }
}

class Voiture(marque: String, val nombrePortes: Int) : VehiculeBase(marque) {
    fun klaxonner() {
        println("Voiture $marque peut klaxonner")
    }

    override fun demarrer() {
        println("La voiture $marque démarre")
    }

    override fun arreter() {
        println("La voiture $marque s'arrête")
    }
}

class Camion(marque: String, val capaciteChargement: String) : VehiculeBase(marque) {
    fun charger() {
        println("Camion $marque peut charger la marchandise ($capaciteChargement)")
    }

    override fun demarrer() {
        println("Le camion $marque démarre")
    }

    override fun arreter() {
        println("Le camion $marque s'arrête")
    }
}

fun main() {
    val voiture1 = Voiture("Mercedes", 4)
    voiture1.klaxonner()
    voiture1.demarrer()
    voiture1.arreter()

    val camion1 = Camion("MAN", "10T")
    camion1.charger()
    camion1.demarrer()
    camion1.arreter()
}
