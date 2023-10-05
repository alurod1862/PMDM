package T12


private var FirstNumber:Int=0
private var SecondNumber:Int=0
private var ThirdNumber:Int=0

private fun DataToAsk(){
    println("Introduce un numero ")
    FirstNumber = readLine()!!.toInt()
    println("Introduce un numero ")
    SecondNumber = readLine()!!.toInt()
    println("Introduce un numero ")
    ThirdNumber = readLine()!!.toInt()
}

private fun Resolution() {

    var mayor:Int=0
    for (i in  1..5){
        DataToAsk()
        mayor += when{
            FirstNumber > SecondNumber && FirstNumber > ThirdNumber -> FirstNumber
            SecondNumber > ThirdNumber -> SecondNumber
            else -> ThirdNumber
        }
    }
    println("El resultado total de los numeros mas grandes es $mayor")

}
fun main() {
    Resolution()
}

