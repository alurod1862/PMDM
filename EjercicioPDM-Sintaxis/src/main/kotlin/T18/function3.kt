package T18

fun sum(v1: Int, v2: Int, v3: Int = 0, v4: Int = 0, v5: Int = 0) = v1 + v2 + v3 + v4 + v5
fun main(parametro: Array<String>) {
    println("La suma de 1 + 2 es ${sum(1,2)}")
    println("La suma de 1 + 2 + 3 es ${sum(1,2,3)}")
    print("La suma de 1 + 2 + 3 + 4 es ${sum(1,2,3,4)}")
}