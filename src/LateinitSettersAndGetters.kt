fun main() {

}

class Car(){
    lateinit var owner: String

    val myBrand: String = "BMW"
    get() {
        return field.toLowerCase()
    }

    init {
        this.owner = "Mason"
    }
}