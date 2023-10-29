package T16


private fun returnAverage(firstNumber:Int,secondNumber:Int,thirdNumber:Int):Int {

    val promedio = (firstNumber+secondNumber+thirdNumber)/3

    return promedio

}

fun main() {
    print("Introduce el  primer numero: ")
    val valor1 = readLine()!!.toInt()
    print("Introduce el segundo numero: ")
    val valor2 = readLine()!!.toInt()
    print("Introduce el tercer numero: ")
    val valor3 = readLine()!!.toInt()

    println("Valor promedio de los tres números  es ${returnAverage(valor1, valor2,valor3)}")
}