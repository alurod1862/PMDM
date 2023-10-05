package T7

private var FirstNumber:Int=0
private var SecondNumber:Int=0
private var ThirdNumber:Int=0

private fun DataToAsk(){
    println("Introduce el primer numero: ")
    FirstNumber = readLine()!!.toInt()
    println("Introduce el segundo numero: ")
    SecondNumber = readLine()!!.toInt()
    println("Introduce el tercero numero: ")
    ThirdNumber = readLine()!!.toInt()
}

private fun Resolution(){

    if (FirstNumber > SecondNumber && FirstNumber > ThirdNumber){
        println("El numero mas grande es $FirstNumber")
    }else{
        if (SecondNumber > ThirdNumber){
            println("El numero mas grande es $SecondNumber")
        }else{
            println("El numero mas grande es $ThirdNumber")

        }
    }
}

fun main() {
    DataToAsk()
    Resolution()

}