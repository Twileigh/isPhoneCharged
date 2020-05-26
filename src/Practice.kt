fun main() {

    val iPhone = MobilePhone("OSX", "Apple", "iPhone 11 Pro", 25)

}

class MobilePhone(osName: String, brand: String, model: String, battery: Int) {
    var chargeLevel = battery

    init {
        println("Phone created. $brand, $model, operating on $osName operating system with $battery percent charge")

        if (chargeLevel != 100) {
            chargeBattery()
        }
    }


    fun chargeBattery() {
        while (chargeLevel < 100) {
            ++chargeLevel
            println("Still Charging")
        }
        println("Battery is now at ${chargeLevel}")
    }

}
