package T22

fun chargeData(): IntArray {
    print("Cuantos elementos tendrá el array:")
    val cantidad = readLine()!!.toInt()
    val vector = IntArray(cantidad)
    for(i in vector.indices) {
        print("Introduce un numero:")
        vector[i] = readLine()!!.toInt()
    }
    return vector
}
fun operation(vector: IntArray): Int {
    var value = 0
    for(i in vector)
        value += i
    return value;
}
fun main(parametro: Array<String>) {
    var vector = chargeData()
    println("Listado  array")
    for(elemento in vector)
        println(elemento)
    println("La suma de todos sus elementos es ${operation(vector)}")
}
