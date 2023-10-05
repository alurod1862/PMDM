package T7

private var FirstNumber:Int=0


private fun DataToAsk(){
    println("Introduce un numero: ")
    FirstNumber = readLine()!!.toInt()

}

private fun Resolution(){
    if(FirstNumber > 0){
        if (FirstNumber >= 999) {
            println("Introduce un numero con 3 digitos")
        }
    }else{
        println("Introduce un numero positivo")
    }
}

fun main() {
    DataToAsk()
    Resolution()
}