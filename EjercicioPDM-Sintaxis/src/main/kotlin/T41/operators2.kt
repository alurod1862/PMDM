package T41

class Vector1 {
    val arreglo = IntArray(5, {it})
    fun imprimir() {
        for (elemento in arreglo)
            print("$elemento ")
        println()
    }
    operator fun plusAssign(vec2: Vector1) {
        for(i in arreglo.indices)
            arreglo[i] += vec2.arreglo[i]
    }
}
fun main(args: Array<String>) {
    val vec1 = Vector1()
    vec1.imprimir()
    val vec2 = Vector1()
    vec2.imprimir()
    vec1 += vec2
    vec1.imprimir()
}