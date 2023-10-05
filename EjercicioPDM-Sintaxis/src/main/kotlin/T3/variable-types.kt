package T3//Tipos de variables




fun Operations(){
    //Problema 1
    val FirstNumber:Int
    FirstNumber = 33
    val SecondNumber:Int
    SecondNumber = 3
    var resultado = FirstNumber + SecondNumber
    println("Resultado suma valores $FirstNumber y $SecondNumber =  $resultado")
    resultado = FirstNumber/SecondNumber
    println("Resultado dividir valores $FirstNumber y  $SecondNumber =  $resultado")
    resultado =FirstNumber*SecondNumber
    println("Resultado multiplicar valores $FirstNumber y  $SecondNumber =  $resultado")
    println("---------------------------------------")
}



fun Cube(){
    //Problema 2

    val numberCube:Int = 50
    val surface:Int= numberCube*4
    val perimeterCube:Int= numberCube*numberCube
    println("La superfice es $surface")
    println("El perimetro es $perimeterCube")
    println("---------------------------------------")
}


fun Weight(){

//Problema 3

    val FirstPersonWeight:Float = 60.7F
    val SecondPersonWeight:Float = 88.9F
    val ThirdPersonWeight:Float = 77.1F
    var average:Float = (FirstPersonWeight + SecondPersonWeight + ThirdPersonWeight)/3
    println("Promedio de peso $average")
}

fun main(args: Array<String>) {

    Operations()
    Cube()
    Weight()


}