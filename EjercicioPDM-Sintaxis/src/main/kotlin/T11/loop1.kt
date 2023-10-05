package T11

private var FirstNumber:Int = 0
private var SecondNumber:Int = 0


private fun DataToAsk(){
    println("Introduce la base: ")
    FirstNumber = readLine()!!.toInt()
    println("Introduce el lado: ")
    SecondNumber = readLine()!!.toInt()
}

private fun Resolution() {


    var contador:Int=0
    for (i in 0..2){
        DataToAsk()
        var surface= (FirstNumber * SecondNumber)/2
        println("La superficie de este triangulo es = $surface")
        if (surface > 12){
            contador += 1
        }
    }



}
fun main() {
    Resolution()
}