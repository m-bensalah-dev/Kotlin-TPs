sealed class EvenementReseau()
class Succes():EvenementReseau()
class Erreur():EvenementReseau()
class Chargement():EvenementReseau()
fun gererEvenementReseau(obj:EvenementReseau): String{
    when(obj){
        is Succes -> return "Les information a ete recupere avec succes."
        is Erreur -> return "Error lors de recuperation de donne"
        is Chargement -> return "Les donnes en cours de chargement."
    }
}
fun main(){
    val obj1 : EvenementReseau = Erreur()
    print(gererEvenementReseau(obj1))
}
