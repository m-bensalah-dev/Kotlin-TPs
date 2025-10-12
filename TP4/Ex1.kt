interface Vehicle{
    fun start()
    fun stop()
}
class Car:Vehicle{
    override fun start(){
        println("car is starting.")
    }
    override fun stop(){
        println("Car is stopping")
    }
}
class Bike:Vehicle{
    override fun start(){
        println("Bike can start.")
    }

    override fun stop() {
        println("Bike can stop.")
    }
}
