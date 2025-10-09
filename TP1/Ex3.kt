fun main(){
    println("Enter un nombre:..")
    var userNumber = readLine()?.toIntOrNull()
    if(userNumber != null && userNumber % 2 == 0){
        println("Le nombre est pair.")
    }else if(userNumber != null && userNumber % 2 != 0){
        println("Le nombre est impair.")
    }else{
        println("Entrer un nombre valide.")
    }
}
