// Interface Animal
interface Animal {
    var nom: String
    fun parler()
    fun seDeplacer()
}

// Interface Volant
interface Volant {
    fun voler()
}

// Classe Oiseau
class Oiseau : Animal, Volant {
    override var nom: String = "Oiseau1"

    override fun parler() {
        println("L'oiseau $nom chante.")
    }

    override fun seDeplacer() {
        println("L'oiseau $nom se déplace en sautillant.")
    }

    override fun voler() {
        println("L'oiseau $nom peut voler.")
    }
}

// Classe Chien
class Chien : Animal {
    override var nom: String = "Doggy"

    override fun parler() {
        println("Le chien $nom aboie.")
    }

    override fun seDeplacer() {
        println("Le chien $nom se déplace en courant.")
    }
}

// Classe Poisson
class Poisson : Animal {
    override var nom: String = "Poisson1"

    override fun parler() {
        println("Le poisson $nom ne fait pas de bruit.")
    }

    override fun seDeplacer() {
        println("Le poisson $nom nage dans l’eau.")
    }
}

fun main() {
    val oiseau = Oiseau()
    oiseau.parler()
    oiseau.seDeplacer()
    oiseau.voler()

    println("")

    val chien = Chien()
    chien.parler()
    chien.seDeplacer()

    println("")

    val poisson = Poisson()
    poisson.parler()
    poisson.seDeplacer()
}
