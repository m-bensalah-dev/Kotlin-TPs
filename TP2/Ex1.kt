class MaClasse(val x:Int = 23,val y:Int = x+5){
    fun affiche(){
        println("La valeur de X: $x et Y: $y")
    }
}
fun main(){
    val obj1 = MaClasse()
    obj1.affiche()
}
