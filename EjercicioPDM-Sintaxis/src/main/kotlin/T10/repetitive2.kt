package T10

private var FirstNumber:Int=1

private fun DataToAsk(){
    println("Introduce un numero: ")
    FirstNumber = readLine()!!.toInt()
}

private fun Resolution() {

    var total:Int=0
    do {
        DataToAsk()
        if (FirstNumber != 9999){
            total += FirstNumber
        }
    } while (FirstNumber < 9999)

    println("El total es $total")
}
fun main() {
    Resolution()
}
