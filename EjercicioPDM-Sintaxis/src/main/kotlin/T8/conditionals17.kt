package T8

private var FirstNumber:Int=0
private var SecondNumber:Int=0
private var ThirdNumber:Int=0


private fun DataToAsk(){
    println("Introduce un numero: ")
    FirstNumber = readLine()!!.toInt()
    println("Introduce un numero: ")
    SecondNumber = readLine()!!.toInt()
    println("Introduce un numero: ")
    ThirdNumber = readLine()!!.toInt()

}

private fun Resolution(){
        var mayor:Int=0
        var menor:Int=0
        if (FirstNumber > SecondNumber && FirstNumber > ThirdNumber){
            mayor= FirstNumber
            if (SecondNumber > ThirdNumber){
                menor= ThirdNumber
            }else{
                menor= SecondNumber
            }
        }else if (SecondNumber > FirstNumber && SecondNumber > ThirdNumber){
            mayor= SecondNumber
            if (FirstNumber > ThirdNumber){
                menor= ThirdNumber
            }else{
                menor= FirstNumber
            }
        }else if (ThirdNumber > FirstNumber && ThirdNumber > SecondNumber){
            mayor= ThirdNumber
            if (FirstNumber > SecondNumber){
                menor= SecondNumber
            }else{
                menor= FirstNumber
            }
        }

    println("El numero mayor es $mayor y el menor $menor")

}

fun main() {
    DataToAsk()
    Resolution()
}