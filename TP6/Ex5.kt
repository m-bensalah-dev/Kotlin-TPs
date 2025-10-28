enum class EtatCommande{
    EN_COURS,EXPEDIEE,LIVREE,ANNULEE;

    fun message(): String{
        return when(this){
            EN_COURS -> "En commande est en cours de traitement"
            EXPEDIEE -> "La commande a été expédiée."
            LIVREE -> "La commande a été livrée."
            ANNULEE -> "La commande a été annulée"

        }
    }
}
class Commande(val numeroCommande: String,var etat:EtatCommande){
    fun changerEtat(nouvelEtat:EtatCommande){
       etat = nouvelEtat
        println("L'état de la commande $numeroCommande a été changé en : ${etat.name}")
        println(etat.message())
    }
}

fun main() {
    val commande1 = Commande("CMD123", EtatCommande.EN_COURS)

    println("État actuel : ${commande1.etat}")
    println(commande1.etat.message())

    
    commande1.changerEtat(EtatCommande.EXPEDIEE)

    commande1.changerEtat(EtatCommande.LIVREE)
}
