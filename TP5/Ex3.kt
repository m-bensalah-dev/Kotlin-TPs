data class User(val id:Int,val name: String,val email: String)

fun filterUser(list:List<User>):List<User>{
    var validUsers = list.filter { it.email.contains("@gmail.com") }
    return validUsers

}
fun main(){
    val user1 = User(1,"khalid","khalid@gmail.com")
    val user2 = User(2,"Naima","Naima@gmail.com")
    val user3 = User(3,"Ahmed","Ahmed@outlook")
    val usersList = mutableListOf(user1,user2,user3)
    val result = filterUser(usersList)
    for(item in result){
        println(item.name)
    }


}
