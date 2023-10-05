package T12


private var FirstNumber:Int=0

private fun DataToAsk(){
    println("Introduce un numero: ")
    FirstNumber = readLine()!!.toInt()
}
private fun Resolution() {

    DataToAsk()
    when{
        FirstNumber > 0 -> println("El numero es positivo")
        FirstNumber < 0 -> println("El numero es negativo")
        FirstNumber == 0 -> println("El numero es cero")
    }


}
fun main() {
    Resolution()
}