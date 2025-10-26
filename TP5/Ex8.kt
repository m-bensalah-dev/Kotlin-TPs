enum class DayOfWeek {
    LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;

    fun printMessage(): String {
        return when(this) {
            LUNDI -> "Début de la semaine"
            MARDI -> "Deuxième jour Mardi"
            MERCREDI -> "Presque"
            JEUDI -> "Demain vendredi"
            VENDREDI -> "Presque le week-end"
            SAMEDI -> "Weekend"
            DIMANCHE -> "C'est le weekend"
        }
    }
}
fun main(){
    val jour = DayOfWeek.VENDREDI
    println(jour.printMessage())
}
