package T9


private var FirstNumber:Int=0
private var SecondNumer:Float=0F


private fun Resolution(){

    println("Introduce el numero de piezas: ")
    FirstNumber = readLine()!!.toInt()
    var n=0
    while (FirstNumber > n){
        println("Introduce el perimettro de cada perfil: ")
        SecondNumer = readLine()!!.toFloat()
        if (SecondNumer in 1.20..1.30){
            println("Apta")
        }else{
            println("No apta")
        }
        n++
    }

}

fun main() {
    Resolution()
}