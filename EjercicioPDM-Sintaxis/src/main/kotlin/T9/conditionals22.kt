package T9

private var FirstNumber:Int=0
private var SecondNumber:Int=0
private var average:Int=0

private fun DataToAsk(){
    println("Introduce el numero de personas: ")
    SecondNumber = readLine()!!.toInt()
}

private fun Resolution(){
    var n=0
    var height=0
    while (SecondNumber > n){
        println("Introduce una altura: ")
        FirstNumber = readLine()!!.toInt()
        height=height + FirstNumber
        n++
    }
    average=height/ SecondNumber
    println("El promedio es  $average")

}

fun main() {
    DataToAsk()
    Resolution()
}