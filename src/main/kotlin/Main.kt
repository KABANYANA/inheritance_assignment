


fun main() {
    var car = Car("Toyota","new model","blue",54)
    car.carry(34)
    car.carry(45)
    car.identity()
    println("The parking fees for a car is " +car.calculateParkingFees(4)+" RWF")


    var bus= Bus("Ritco","zhonda","cyan",95)
    println("The maximum fare per trip is " +bus.maxTripFare(arrayOf(13.5,56.5,23.0,54.1,67.8)))
    println("the parking fees for a bus is "+ bus.calculateParkingFees(4)+" RWF")

}




//                                    CAR CLASS
open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        if (people<=35){
            println("carrying $people passengers")
        }
        else{
            println("overcapacity by $people people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int): Int{
        var parkingFees= hours*20
        return parkingFees
    }
}

//                      BUS CLASS
class Bus(make:String, model:String, color:String, capacity:Int):Car(make, model, color, capacity){
    fun maxTripFare(fare:Array<Double>):Double{
        return fare.max()
    }

    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
        var parkingFees = hours*capacity
        return parkingFees
    }

}
