package T8

private var FirstNumber:Int=0
private var SecondNumber:Int=0


private fun DataToAsk(){
    println("Introduce la coordenada x: ")
    FirstNumber = readLine()!!.toInt()
    println("Introduce la coordenada y: ")
    SecondNumber = readLine()!!.toInt()
}

private fun Resolution(){
    if (FirstNumber > 0 && SecondNumber > 0){
        println("Coordenadas en el cuadrante 1")
    }else if(FirstNumber < 0 && SecondNumber > 0){
        println("Coordendas en el cuandrante 2")
    }else if(FirstNumber < 0 && SecondNumber < 0){
        println("Coordenadas en el cuandrante 3")
    }else if(FirstNumber > 0 && SecondNumber < 0){
        println("Coordendas en el cuandrante 4")
    }else{
        println("Esta en el eje")
    }

}

fun main() {
    DataToAsk()
    Resolution()
}