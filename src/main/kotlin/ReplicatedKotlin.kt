import kotlin.text.*

fun main() {
    printHelloWorld()
    printing()
}

fun printHelloWorld(){
    print("Hello World")
}

fun printing() {
    print("Hello World")
    println("Hello world!")
}


fun voidReturnValueWithUnit(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun conditionalAsExpression(a: Int, b: Int) = if (a > b) a else b

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun withinRange(x: Int, y: Int): Boolean {
    return x in 1..y + 1
}

fun inCollection(items: Array<String>): String {
    var str = "Nothing to say."
    when {
        "orange" in items -> str = "juicy"
        "apple" in items -> str = "apple is fine too"
    }
    return str
}

fun collectionLambdaExpression(list: Array<String>): MutableList<String> {
    val filteredList = mutableListOf<String>()
    list
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { filteredList.add(it) }

    return filteredList
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}
fun getProduct(arg1: String, arg2: String): Int? {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if (x != null && y != null) {
        return (x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
        return null
    }
}
fun castNumber(arg1: String, arg2: String): Int? {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return null
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return null
    }
    return (x * y)
}

fun getProductFromOptional(x: Int?, y: Int?): Int? {
    if (x != null && y != null) {
        return (x * y)
    }
    else {
        println("'$x' or '$y' is not a number.")
        return null
    }
}

fun getStringLength1(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}
fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null
    return obj.length
}
fun getStringLength3(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}
fun automaticCastOneVariable(arg1: Int?): Int? {
    if (arg1 != null) {
        return arg1 * 2
    } else {
        return null
    }
}

/*fun arbitraryExpInTemplate(): String {
    s = 2
    val s2 = "${s1.replacingOccurrences("is", "was")}, but now is${s}"
    return s2
}
fun arbitraryExpInTemplate(): String {
    println(s1)
    s = 2
    val s2 = "${s1.replacingOccurrences("is", "was")}, but now is ${s}"
    return s2
}*/

/*fun arbitraryExpInTemplate(): String {
    var s = 2
    val s2 = "${s1.replace("is", "was")}, but now is ${s}"
    return s2
}*/


