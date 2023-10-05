package T6

private var FirstNumber:Int=0

private fun DataToAsk(){
    print("Introduce un numero: ")
    FirstNumber = readLine()!!.toInt()
}

private fun Resolution(){
    var result:Int=0
    if (FirstNumber %2== 0 ){
        result = FirstNumber* FirstNumber
        println("El cuadrado de el numero introducido $result")
    }else{
        result= FirstNumber* FirstNumber* FirstNumber
        println("El cubo de el numero introducido es $result")
    }

}

fun main() {
    DataToAsk()
    Resolution()

}