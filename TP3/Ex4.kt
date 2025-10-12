open class Appareil(val marque: String,var allume:Boolean=false){
    init {
        println("La cration de l'appareil de marque: $marque")
    }
    fun allumer(){allume = true}
}
class Telephone(marque: String,val numeroDeTelephone: String):Appareil(marque){
    init {
        println("Un telephone a ete cree avec le numero de telephone: $numeroDeTelephone")
    }
}
class Ordinateur(marque: String,val systemeDeExploitation: String):Appareil(marque){
    init {
        println("Un ordinateur a ete cree avec systeme de exploitation: $systemeDeExploitation")
    }
}
fun main(){
    val telephone1 = Telephone("Samsung","0678434567")
    val ordinateur1 = Ordinateur("Dell","Windows")

}
