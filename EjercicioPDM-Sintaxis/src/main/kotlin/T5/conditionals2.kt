package T5


private var FirstNumber:Int= 0;
private var SecondNumber:Int = 0;

private fun DataToAsk(){
    print("Introduce un numero: ")
    FirstNumber = readLine()!!.toInt()
    print("Introduce un numero: ")
    SecondNumber  = readLine()!!.toInt()
}

private fun Resolution(){
    if(FirstNumber> SecondNumber){
        println(FirstNumber)
    }else{
        println(SecondNumber)
    }
}

private fun FirstProblem(){
    DataToAsk()
    Resolution()
}

fun main() {
    FirstProblem()
}