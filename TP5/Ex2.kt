sealed class OperationResult()
class Success(val data: String):OperationResult()
class Failure(val errorMessage: String):OperationResult()
class Loading():OperationResult()

fun gererOperationResult(obj:OperationResult){
    when(obj){
        is Success -> println("Data extracted successfuly ${obj.data}")
        is Failure -> println("Error when extracting data ${obj.errorMessage}")
        is Loading -> println("data in progressing...")
    }
}
fun main(){
    val success1 : OperationResult = Success("name => khalid : Age => 22")
    gererOperationResult(success1)

    val failure1 : OperationResult= Failure("Slow internet connection.")
    gererOperationResult(failure1)

    val loading1 : OperationResult = Loading()
    gererOperationResult(loading1)
}
