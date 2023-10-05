package T6


private var FirstNumber:Int=0
private var SecondNumber:Int=0

private fun DataToAsk(){
    print("Introduce el primer numero: ")
    FirstNumber = readLine()!!.toInt()
    print("Introduce el segundo numero: ")
    SecondNumber = readLine()!!.toInt()
}

private fun Resolution(){
    var BiggerNumber:Int=0
    if (FirstNumber > SecondNumber){
        BiggerNumber= FirstNumber
    }else {
        BiggerNumber = SecondNumber
    }
    println("El numero mayor es $BiggerNumber")
}


fun main() {
    DataToAsk()
    Resolution()

}