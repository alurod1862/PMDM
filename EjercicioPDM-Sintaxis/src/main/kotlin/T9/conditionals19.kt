package T9

private var Number:Int=0


private fun DataToAsk(){
    println("Introduce un numero: ")
    Number = readLine()!!.toInt()
}

private fun Resolution(){
    var cant:Int=1
    var sum:Int=0
    var average:Int=0
    while (cant <= 10){
        DataToAsk()
        sum=sum + Number
        cant++
    }
    average=sum/10
    println("La suma de los numeros es $sum y el promedio es $average")

}

fun main() {
    Resolution()
}