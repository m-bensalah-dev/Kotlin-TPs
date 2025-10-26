class Library(val libraryName: String){
    inner class Book(val title: String,val author: String){
        fun afficherDetails(){
            println("The book $title created by $author is in the library $libraryName")
        }
    }
}
fun main(){
    val myLibrary = Library("Al nour")
    val book1 = myLibrary.Book("Riche dad","Robert kiozaki")
    book1.afficherDetails()
}
