open class Forme(val couleur: String){
    open fun afficherInfo(){
        println("Couleur: $couleur")
    }
}
class Cercle(couleur: String,val rayon: Int):Forme(couleur){
    override fun afficherInfo(){
        super.afficherInfo()
        println("Rayon: $rayon")
    }

}
class Rectangle(couleur: String,val largeur:Int,val hauteur:Int):Forme(couleur){
    override fun afficherInfo(){
        super.afficherInfo()
        println("Largeur: $largeur,Hauteur: $hauteur")
    }

}
fun main(){
    val cercle1 = Cercle("Red",4)
    val rectangle1 = Rectangle("Black",9,8)
    cercle1.afficherInfo()
    rectangle1.afficherInfo()
}


