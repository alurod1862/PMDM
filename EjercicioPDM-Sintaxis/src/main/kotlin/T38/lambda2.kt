package T38


private val vector = FloatArray(10)

private fun chargeData(){
    for(i in vector.indices) {
        print("Ingrese elemento:")
        vector[i] = readLine()!!.toFloat()
    }
}

private fun operation(){
    for(elemento in vector)
        print("$elemento ")
    println()
    val cant = vector.count { it < 50}
    println("Cantidad de valores ingresados menores a 50: $cant")
    if (vector.all {it < 50}){
        println("Todos los valores son menores a 50")}
    else{
        println("No todos los valores son menores a 50")}
}
fun main(parametro: Array<String>) {
    chargeData()
    operation()
}