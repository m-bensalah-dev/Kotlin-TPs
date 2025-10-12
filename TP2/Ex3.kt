class Car(var marque: String, var modele: String, var couleur: String, var kilometrage: Double) {

    fun UpdateMarque(newMarque: String) {
        marque = newMarque
    }

    fun UpdateModele(newModele: String) {
        modele = newModele
    }

    fun UpdateCouleur(newCouleur: String) {
        couleur = newCouleur
    }

    fun UpdateKilometrage(newKilometrage: Double) {
        kilometrage = newKilometrage
    }

    fun affiche() {
        println("Marque: $marque, Modèle: $modele, Couleur: $couleur, Kilométrage: $kilometrage km")
    }
}

fun main() {
    val car1 = Car("Mercedes", "Benz", "Noire", 120000.0)

    car1.affiche()
    println("Apres mise a jour du kilométrage")
    car1.UpdateKilometrage(200000.0)
    car1.affiche()
}
