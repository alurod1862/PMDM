package T11

private var FirstNumber:Int=0
private var SecondNumber:Int=0


private fun DataToAsk(){
    println("Introduce la base: ")
    FirstNumber = readLine()!!.toInt()
    println("Introduce el lado: ")
    FirstNumber = readLine()!!.toInt()
}

private fun Resolution() {

    var surface:Int=0
    for (i in 0..3){
        DataToAsk()
        surface= FirstNumber* SecondNumber/2
    }



}
fun main() {
    Resolution()
}