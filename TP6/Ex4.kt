class Banque{
    fun creerCompte(numero:String,soldeInitial:Double): CompteBancaire{
        val objFromCompteBancaire = CompteBancaire(numeroCompte=numero,solde=soldeInitial)
        return objFromCompteBancaire
    }

    class CompteBancaire(val numeroCompte: String,var solde:Double){

        fun deposer(montant:Double){
            if(montant > 0){solde+=montant}else{println("Insuffisant amount.")}
            println("Montant $montant a ete ajoute avec success.")
        }
        fun retirer(montant: Double){
            if(montant > 0 || solde >= montant){solde-=montant}else{println("Entrer un montant valide.")}
            println("Le Montant $montant a ete retire avec success.")
        }
        fun afficherSolde(){
            println("Solde: $solde")
        }

    }
}
fun main(){
    val CIH_BANK = Banque()
    val account1 = CIH_BANK.creerCompte("12345",3000.0)
    account1.deposer(1500.0)
    account1.afficherSolde()



}
