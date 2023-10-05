package T8

private var FirstNumber:Int=0
private var SecondNumber:Int=0


private fun DataToAsk(){
    println("Introduce un dia: ")
    FirstNumber = readLine()!!.toInt()
    println("Introduce un mes: ")
    SecondNumber = readLine()!!.toInt()

}

private fun Resolution(){
    if (FirstNumber == 25 && SecondNumber == 12){
        println("Es navidad")
    }
}

fun main() {
    DataToAsk()
    Resolution()
}