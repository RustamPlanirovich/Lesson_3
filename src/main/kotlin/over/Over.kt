package over

interface Clickable {
    fun click()
}

open class RichButton : Clickable {
    override fun click() {}
    open fun disable() {}
}

class AnimatedButton : RichButton() {
    override fun click() {
        super.click()
    }

    override fun disable() {
        super.disable()
    }
}

abstract class Animated() {
    abstract fun animate()
    fun startAnimate() {}
    open fun startAnimate1() {}
}

class Animator() : Animated() {
    override fun animate() {
        TODO("Not yet implemented")
    }

//    override fun startAnimate() {}

    override fun startAnimate1() {
        super.startAnimate1()
    }

}

class Outer() { //внешний
    class Nested() { //вложенный

    }

    inner class Internal() {
        fun getOuter(): Outer = this@Outer
    }
}

class User(val name: String) {

}

data class Client(val name: String, val index: Int)
//{
//    override fun toString(): String {
//        return "name: $name, index: $index"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other == null|| other !is Client) return false
//        return name == other.name && index == other.index
//    }
//
//    override fun hashCode(): Int = name.hashCode()*37 + index
//}

fun main() {

    val misha = Client("Misha", 112112)
    val masha = Client("Misha", 112112)
    val vasya = masha.copy(name = "Vasya")
    val set = hashSetOf(misha)
    println(set.contains(misha))
    println(set.contains(vasya))
    println(misha == masha)
//    val masha = Client("Misha", 112112)
//    println(misha == masha)
//    val outer = Outer()
//    val nested = Outer.Nested()
//    val internal = outer.Internal().getOuter()
//    println(outer)
//    println(internal)
}