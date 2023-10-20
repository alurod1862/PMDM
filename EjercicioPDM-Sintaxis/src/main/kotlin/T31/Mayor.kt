package T31

object Mayor {
    fun maximo(x1: Int, x2: Int) = if (x1 > x2) x1 else x2
    fun maximo(x1: Float, x2: Float) = if (x1 > x2) x1 else x2
    fun maximo(x1: Double, x2: Double) = if (x1 > x2) x1 else x2
}
fun main(parametro: Array<String>) {
    println(Mayor.maximo(4, 5))
    println(Mayor.maximo(10.2f, 23.5f))
    println(Mayor.maximo(4.5, 5.2))
}