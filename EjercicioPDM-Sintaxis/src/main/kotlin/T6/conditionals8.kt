package T6

private var FirstNumber:Int=0

private fun DataToAsk(){
    print("Introduce un numero(Entre 1-99): ")
    FirstNumber = readLine()!!.toInt()
}

private fun Resolution(){
    if (FirstNumber in 1..9){
        println("El numero que has introducido tiene un digito")
    }else{
        println("El numero que has introducido tiene dos digitos")
    }
}

fun main() {
    DataToAsk()
    Resolution()
}