// 1. Enumération Piece
enum class Piece {
    SALON, CHAMBRE, CUISINE, GARAGE
}

// 2. Interface ConsommationCalculator
interface ConsommationCalculator {
    fun calculerConsommation(temperature: Int, duree: Int): Double
}

// 3. Classe abstraite AppareilDomotique
abstract class AppareilDomotique(
    val marque: String,
    val modele: String
) {
    abstract fun estAdapteA(piece: Piece): Boolean

    fun description(): String {
        return "Marque : $marque, Modèle : $modele"
    }
}

// 4. Classe AppareilConfort
class AppareilConfort(
    marque: String,
    modele: String
) : AppareilDomotique(marque, modele), ConsommationCalculator {

    override fun estAdapteA(piece: Piece): Boolean {
        return piece == Piece.SALON || piece == Piece.CHAMBRE
    }

    override fun calculerConsommation(temperature: Int, duree: Int): Double {
        return (temperature.toDouble() / 25) + (duree.toDouble() / 60)
    }
}

// 4. Classe AppareilTechnique (avec surcharge)
class AppareilTechnique(
    marque: String,
    modele: String
) : AppareilDomotique(marque, modele), ConsommationCalculator {

    override fun estAdapteA(piece: Piece): Boolean {
        return piece == Piece.CUISINE || piece == Piece.GARAGE
    }

    override fun calculerConsommation(temperature: Int, duree: Int): Double {
        var consommation = (temperature / 25.0) + (duree / 60.0)

        // 8. +20% si température > 30°C
        if (temperature > 30) {
            consommation *= 1.2
        }

        return consommation
    }
}

// 5 & 7. GestionnaireDomotique
class GestionnaireDomotique {

    fun recommander(piece: Piece): AppareilDomotique? {
        val appareil = when (piece) {
            Piece.SALON, Piece.CHAMBRE ->
                AppareilConfort("Samsung", "ComfortX")

            Piece.CUISINE, Piece.GARAGE ->
                AppareilTechnique("Bosch", "TechPro")
        }

        return if (appareil.estAdapteA(piece)) {
            appareil
        } else {
            println("Aucun appareil compatible avec la pièce $piece")
            null
        }
    }
}

fun main() {

    val pieceChoisie = Piece.CUISINE
    val temperature = 35
    val duree = 120

    val gestionnaire = GestionnaireDomotique()
    val appareil = gestionnaire.recommander(pieceChoisie)

    if (appareil != null && appareil is ConsommationCalculator) {
        println(appareil.description())
        val consommation = appareil.calculerConsommation(temperature, duree)
        println("Consommation estimée : $consommation")
    } else {
        println("Aucun appareil recommandé.")
    }
}
