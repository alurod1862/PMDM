package T7

private var FirstNumber:Int=0
private var SecondNumber:Int=0



private fun DataToAsk(){
    println("Introduce el numero de preguntas:  ")
    FirstNumber = readLine()!!.toInt()
    println("Introduce el numero de preguntas correctas: ")
    SecondNumber = readLine()!!.toInt()
}


private fun Resolution(){
    val porcentaje:Int
    porcentaje= SecondNumber*100/FirstNumber;

    if (porcentaje >= 90){
        println("Nivel Maximo")
    }else{
        if (porcentaje >= 75){
            println("Nivel medio")
        }else{
            if (porcentaje >= 50){
                println("Nivel regular")
            }else{
                println("Fuera de nivel")
            }
        }
    }
}

fun main() {
    DataToAsk()
    Resolution()
}