package T8

private var FirstNumber:Int=0
private var SecondNumber:Int=0
private var ThirdNumber:Int=0


private fun DataToAsk(){
    println("Introduce un dia: ")
    FirstNumber = readLine()!!.toInt()
    println("Introduce un mes: ")
    SecondNumber = readLine()!!.toInt()
    println("Introduce un numero")
    ThirdNumber = readLine()!!.toInt()

}

private fun Resolution(){
    val cubo= FirstNumber* SecondNumber* ThirdNumber
    if (FirstNumber == SecondNumber && FirstNumber == ThirdNumber){
        println(cubo)
    }
}

fun main() {
    DataToAsk()
    Resolution()
}