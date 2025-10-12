class Personne(var nom:String,var prenom:String,var adresse: String,var age:Int){
    fun UpdateNom(newNom: String){
        nom = newNom
    }
    fun UpdatePrenom(newPrenom: String){
        prenom = newPrenom
    }
    fun UpdateAge(newAge:Int){
        age = newAge
    }
    fun UpdateAdresse(newAdresse: String){
        adresse = newAdresse
    }
    fun affiche(){
        println("Nom: $nom,Prenom: $prenom,Adresse: $adresse,Age: $age")
    }

}
fun main(){
    val personne1 = Personne("khalid","nasiri","Rabat,Hay al nakhil,",22)
    println(personne1.nom)
    personne1.UpdateNom("Ahmed")
    println(personne1.nom)
    personne1.affiche()

}
