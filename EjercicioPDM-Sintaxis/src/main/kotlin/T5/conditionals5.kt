package T5


private var FirstNumber:Int=0


private fun DataToAsk(){
    print("Introduce un numero(entre 1-99): ")
    FirstNumber= readLine()!!.toInt()
}


private fun Resolution(){

    if (FirstNumber>=10 && FirstNumber<=99){
        println("El numero introducido tiene dos digitos")
    }else{
        println("El numero introducido tiene un digito ")
    }

}

fun main() {
    DataToAsk()
    Resolution()
}