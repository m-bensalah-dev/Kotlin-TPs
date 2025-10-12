open class Personne(val nom: String,val age: Int = 24){
    open fun afficherDetails(){
        println("Nom: $nom,Age: $age")
    }
}
class Eleve(nom: String,age: Int,val niveau: String):Personne(nom,age){
    override fun afficherDetails() {
        super.afficherDetails()
        println("Niveau: $niveau")
    }
}
class Employe(nom: String,age: Int,val poste: String):Personne(nom,age){
    override fun afficherDetails() {
        super.afficherDetails()
        println("Poste: $poste")
    }
}
fun main(){
    val eleve1 = Eleve("khalid",22,"Licence")
    val employee1 = Employe("Ahmed",34,"Manager")
    eleve1.afficherDetails()
    employee1.afficherDetails()
}
