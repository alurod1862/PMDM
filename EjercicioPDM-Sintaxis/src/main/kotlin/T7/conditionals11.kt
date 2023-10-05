package T7

private var FirstNumber:Int=0


private fun DataToAsk(){
    println("Introduce el primer numero: ")
    FirstNumber = readLine()!!.toInt()
}

private fun Resolution(){
        if (FirstNumber > 0){
            println("El numero introducido es positivo")
        }else{
            if (FirstNumber == 0){
                println("El numero introducido es nulo")
            }else{
                println("El numero introducido es negativo")
            }
        }
}

fun main() {
    DataToAsk()
    Resolution()
}