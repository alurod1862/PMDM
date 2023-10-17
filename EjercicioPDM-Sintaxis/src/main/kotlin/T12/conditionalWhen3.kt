package T12



private fun dataToAsk():Int{
    println("Introduce un numero ")
    return readLine()!!.toInt()

}

private fun Resolution() {
    var firstNumber:Int=0
    var secondNumber:Int=0
    var thirdNumber:Int=0
    var mayor:Int=0
    for (i in  1..5){
        firstNumber = dataToAsk()
        secondNumber =  dataToAsk()
        thirdNumber = dataToAsk()
        mayor += when{
            firstNumber > secondNumber && firstNumber > thirdNumber -> firstNumber
            secondNumber > thirdNumber -> secondNumber
            else -> thirdNumber
        }
    }
    println("El resultado total de los numeros mas grandes es $mayor")

}
fun main() {
    Resolution()
}

