fun main(){
    var benzi = Car("Benzi","A45","HKD 567D",0)
    println(benzi.model)
    println(benzi.make)
    println(benzi.regestration)
    println()
    println(benzi.noMovement())
    println(benzi.accelarate(70))
    println(benzi.deccelete(20))
}
class Car(var model:String,var make:String,var regestration:String,var speed:Int) {
    fun start() {
        println("Choooio gio gio")

    }

    fun accelarate(acceleration: Int): Int {
        speed += acceleration
        return speed
    }

    fun deccelete(decceletion: Int): Int {
        speed -= decceletion
        return speed
    }

    fun noMovement(): Int {
        speed = 0
        return speed
    }
}




