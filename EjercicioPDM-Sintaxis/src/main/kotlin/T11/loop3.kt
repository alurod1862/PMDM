package T11

private var FirstNumber:Int = 0

private fun DataToAsk(){
    println("Introduce un numero: ")
    FirstNumber = readLine()!!.toInt()
}

private fun Resolution() {
    DataToAsk()
    var suma:Int=0
    if (FirstNumber <= 10){
        for (i in 1..12){
            suma= FirstNumber*i
            println(suma)
        }
    }else{
        println("Numero no valido")
    }


}
fun main() {
    Resolution()
}




