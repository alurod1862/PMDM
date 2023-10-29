package T15



private fun DataToAsk(mensaje: String){
    println("---------------------------------------")
    println(mensaje)
    println("---------------------------------------")
}


private fun cargarSumar() {
    print("Ingrese el primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}

fun main() {
    DataToAsk("El siguiente programa suma dos valores")
    cargarSumar()


}