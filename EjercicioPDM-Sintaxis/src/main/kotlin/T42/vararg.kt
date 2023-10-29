package T42

private fun greaterQuantity(vararg edades: Int) = edades.count {it >= 18}
fun main(args: Array<String>) = println(greaterQuantity(3, 65, 32, 23, 2, 98, 23, 45, 15))