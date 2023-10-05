package T5



private var FirstNumber:Int=0
private var SecondNumber:Int=0
private var ThirdNumber:Int=0


private fun DataToAsk(){
    print("Introduce el primer numero: ")
    FirstNumber = readLine()!!.toInt()
    print("Introduce el segundo numero: ")
    SecondNumber = readLine()!!.toInt()
    print("Introduce el tercer numero: ")
    ThirdNumber = readLine()!!.toInt()
}

private fun Resolution(){
    val average=(FirstNumber + SecondNumber + ThirdNumber)/3
    if (average > 7){
        println("Promocionado")
    }
}

fun main() {
    DataToAsk()
    Resolution()
}