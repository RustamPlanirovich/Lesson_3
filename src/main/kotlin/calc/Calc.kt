package calc

import java.lang.IllegalArgumentException

interface Animal {
    fun say()
}

class Goat() : Animal {
    override fun say() = println("Beeee")
}

class Cow() : Animal {
    override fun say() = println("Muuu!")
}

class Dog() : Animal {
    override fun say() = println("Bark!")
}

fun fib(number: Int): Int {
    var ret = 1
    var prev = 1
    var counter = 0
    while (counter++ < number) {
        var temp = ret
        ret += prev
        prev = temp
    }
    return ret
}

fun Any.print(): String = when (this) {
    is Int -> "Int: ${this.toString()}"
    is String -> "String: ${this.toString()}"
    else -> "Don't know: ${this.toString()}"
}

fun List<Int>.sum(): Int {
    var sum = 0
    for (i in this) {
        sum += i
    }
    return sum
}

fun isValidId(string: String): Boolean {
    return string.matches("""[a-zA-Z0-9]\w{4,}""".toRegex())
}

sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
class Mul(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int {
    return when (e) {
        is Num -> e.value
        is Sum -> {
            eval(e.left) + eval(e.right)
        }
        is Mul -> {
            eval(e.left) * eval(e.right)
        }
//        else -> throw IllegalArgumentException("Unknown expr")
    }
}

fun StringBuilder.lastCharOf(): Char = get(length - 1)
var StringBuilder.LastCharOf: Char
    get() = get(length - 1)
    set(value) = setCharAt(length - 1, value)

fun main() {
    var b = StringBuilder("Hello")
    b.LastCharOf = '!'
    println(b)
//    println(eval(Sum(Num(2), Num(3))))
//    println(eval(Sum(Num(2), Mul(Num(3), Num(7)))))
//    val farm = listOf<Animal>(Goat(), Cow(), Dog())
//    for (animal in farm){
//        animal.say()
//    }
//    println(isValidId("test1"))
//    println(isValidId(""))
//    println(isValidId("13"))
//    println(isValidId("abc 123"))
//    println(listOf(1, 2, 3).sum())
//    println(fib(readLine()!!.toInt()))
//    println("123".print())
//    println(123.print())
//    println(12.3f.print())

    val long: Long = 212
    val int: Int = long.toInt()
    val int1: Int = "123".toInt()
}