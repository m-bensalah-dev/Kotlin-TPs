open class Forme(val nom: String){
    open fun surface(): Number{ return 0 }
    open fun perimetre(): Number{ return 0 }
    open fun afficher_details(){
        println("Surafce: ${surface()} cm²,Perimetre: ${perimetre()} cm")
    }
}
// Class Carre
class Carre(nom: String,var cote: Number):Forme(nom){
    override fun surface(): Number{ return cote.toDouble() * cote.toDouble() }
    override fun perimetre(): Number{ return 4 * cote.toDouble() }
    override fun afficher_details() {
        super.afficher_details()
    }
}
// Class Rectangle
class Rectangle(nom: String, var longeur: Number, var largeur: Number):Forme(nom){
    override fun surface(): Number{ return longeur.toDouble()*largeur.toDouble() }
    override fun perimetre(): Number { return 2*(largeur.toDouble()+longeur.toDouble()) }
    override fun afficher_details() {
        super.afficher_details()
    }
}
// Class Cercle
class Cercle(nom: String,var rayon: Number):Forme(nom){
    override fun surface(): Number { return 3.14 * (rayon.toDouble()*rayon.toDouble()) }
    override fun perimetre(): Number { return 2 * 3.14 * rayon.toDouble() }
    override fun afficher_details() {
        super.afficher_details()
    }
}
fun main(){
    val carre1 = Carre("carre1",6)
    val rectangle1 = Rectangle("rectangle1",10,5)
    val cercle1 = Cercle("cercle1",9.5)
    carre1.afficher_details()
    rectangle1.afficher_details()
    cercle1.afficher_details()
}
