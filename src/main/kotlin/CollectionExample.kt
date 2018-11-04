data class User(val name: String, val age: Int, val admin: Boolean = false)

class CollectionExample {

    val users: List<User> = arrayListOf(
            User(age = 37, name = "Per Henden"),
            User("Jim Bob Balooba", 44),
            User("Harry Dresden", 41),
            User("Bob Howard", 35, true),
            User("Karen Murphy", 33)
    )

    fun printAdmins() = {
        val isAdminLambda: (User) -> Boolean = { it.admin }
        val admins = users.filter(isAdminLambda)
        println(admins)
        // unit return type omitted
    }

    fun lowestAge(): Int? {
        val selectAge: (User) -> Int = { it.age }

        return users.map(selectAge).min()
    }

    fun hasEvenNumberAge() = users.map({ it.age }).filter { isEven(it) }

    fun isEven(number: Int) = number % 2 == 0 // return type is inferred to be Boolean

}

// Method declared outside of class, belongs to package
fun myMaxOf(a: Int, b: Int) = if (a > b) a else b


fun main() {
    val example = CollectionExample()
    example.printAdmins()

    val lowest = example.lowestAge()
    println("Lowest age was $lowest")

    var maxValue = 0 // mutable variable
    maxValue = myMaxOf(5, 10)
    // maxValue = null // not allowed

    var evenSteven: List<Int>? = null
    evenSteven = example.hasEvenNumberAge()
    println("Found these even ages: $evenSteven")
    println("---")

    val multilineText = """
        I'm a multiline text
            Look how easy I am to read
        I have variables: $maxValue
    """.trimIndent()
    println(multilineText)


    // Pattern matching example
    println("---")

    val x = 3
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x is neither 1 nor 2")
    }

    println("---")
    example.users.forEach {
        when (it.age) {
            37, 41 -> print("Prime!")
            example.lowestAge() -> print("Lowest number")
        }

    }
}