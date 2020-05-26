fun main() {

    // Creating instance of class Person
    var mason = Person("Mason", "Dubelbeis")
    var kayla = Person("Kayla", "Dubelbeis")
    var declan = Person("Declan", "Dubelbeis", 9) // I am now able to add an age argument since the secondary constructor parameter.
    // var jon = Person() => Will trigger error since there is no arguments and no defaults in class parameters.
    mason.age = 32
    mason.hobby = "Painting"
    mason.stateHobby()
    println("Mason is ${mason.age} years old.")
    kayla.hobby = "Arts and Crafts"
    kayla.stateHobby()
}

class Person(firstName: String, lastName: String) {

    // Member Variable - Properties
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var name = firstName

    init {
        //println("Person Created")
        println("Initialized a new person object with firstname: ${firstName.toUpperCase()} and lastname: ${lastName.toUpperCase()}")
    }

    // Member Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
        : this(firstName, lastName){
            this.age = age
            println("Initialized a new person object with firstname: ${firstName.toUpperCase()} and lastname: ${lastName.toUpperCase()} and $age years old.")
            // We will have two initializations. We will see a person is created and if the age is is argument, this will print again.
        }


    //Member Function - Methods
    fun stateHobby(){
        var name = this.name
        println("$name's hobby is $hobby")
    }
}