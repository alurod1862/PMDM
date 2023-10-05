package T10

private var FirstNumber:Int=1


private fun DataToAsk(){
    println("Introduce un numero: ")
    FirstNumber = readLine()!!.toInt()
}

private fun Resolution() {
    do {
        DataToAsk()
        if (FirstNumber in 1..9) {
            println("El numero introducido tiene 1 digito")
        } else if (FirstNumber in 10..99) {
            println("El numero introducido tiene 2 digitos")
        } else if (FirstNumber in 100..999) {
            println("El numero introducido tiene 3 digitos")
        }

    } while (FirstNumber !== 0)
}
fun main() {
    Resolution()
}