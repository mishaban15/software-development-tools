private val persons = ArrayList<Person>()

fun main() {

    persons.add(Person("Mark", "Roche"))
    persons.add(Person("John", "Walsh"))
    persons.add(Person("Sheila", "Flynn"))

    for (person in persons) {
        println(person)
    }

    println()

    for ((index, value) in persons.withIndex()) {
        println("$index: $value")
    }

    println("\nUsing Lambdas:\n")

    persons.forEach { println(it) }

    println("\nFiltering first name as John:")

    persons
        .filter { it.firstName.contains("John") }
        .forEach { println(it) }

    println("\nSorting by last name:")

    persons
        .sortedBy { it.lastName }
        .forEach { println(it) }

    println("\nSorting by last name, last name uppercased:")

    persons
        .sortedBy { it.lastName }
        .forEach {
            println("Person: ${it.firstName}, ${it.lastName.uppercase()}")
        }
}

fun personInfo() {

    val person1 = Person("Mark", "Roche")
    val person2 = person1.copy(firstName = "Clare")
    val person3 = person1.copy()

    println(person1)
    println(person2.toString())

    println("person1 hashcode = ${person1.hashCode()}")
    println("person2 hashcode = ${person2.hashCode()}")
    println("person3 hashcode = ${person3.hashCode()}")

    if (person1 == person2) {
        println("person1 is equal to person2.")
    } else {
        println("person1 is not equal to person2.")
    }

    if (person1 == person3) {
        println("person1 is equal to person3.")
    } else {
        println("person1 is not equal to person3.")
    }
}