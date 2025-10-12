interface Animal {
    var name: String
    fun makeSound()
}

class Dog(val dogName: String) : Animal {
    override var name: String = dogName

    override fun makeSound() {
        println("$name can bark.")
    }
}

class Cat(val catName: String) : Animal {
    override var name: String = catName

    override fun makeSound() {
        println("$name can meow.")
    }
}

fun main() {
    val dog1 = Dog("Doggy")
    dog1.makeSound()

    val cat1 = Cat("Ketty")
    cat1.makeSound()
}
