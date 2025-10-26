sealed class Operation()
class Addition(val a: Double,val b: Double):Operation()
class Soustraction(val a: Double,val b: Double):Operation()
class Multiplication(val a: Double,val b: Double):Operation()
class Division(val a: Double,val b: Double):Operation()

fun calculer(operation: Operation): Double{
    return when(operation){
        is Addition -> operation.a + operation.b
        is Soustraction -> operation.a - operation.b
        is Multiplication -> operation.a * operation.b
        is Division -> if(operation.b != 0.0){operation.a / operation.b}else{0.0}

    }
}

fun main(){
    val addition1 : Operation = Addition(4.0,56.0)
    println(calculer(addition1))

    val soustraction1 : Operation = Soustraction(6.0,2.0)
    println(calculer(soustraction1))

    val multiplication1 : Operation = Multiplication(6.0,2.0)
    println(calculer(multiplication1))

    val division1 : Operation = Division(4.0,0.0)
    println(calculer(division1))
}
