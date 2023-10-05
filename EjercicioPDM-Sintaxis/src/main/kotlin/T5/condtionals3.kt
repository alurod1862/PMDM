package T5

private var FirstNumber:Int=0
private var SecondNumber:Int=0


private fun DataToAsk(){
    print("Introduce el primer numero: ")
    FirstNumber = readLine()!!.toInt()
    print("Introduce el segundo numero: ")
    SecondNumber = readLine()!!.toInt()
}

private fun Resolution(){
    if (FirstNumber< SecondNumber){
        var suma= FirstNumber+ SecondNumber
        var resta= SecondNumber - FirstNumber
        println("El resultado de sumar los numeros es $suma ")
        println("El resultado de restar los numeros es $resta")
    }else{
        var producto= FirstNumber* SecondNumber
        var division= FirstNumber/ SecondNumber
        println("El resultado de multiplicar los numeros es $producto ")
        println("El resultado de dividir los numeros es $division ")
    }
}

private fun FirstProblem(){
    DataToAsk()
    Resolution()
}

fun main() {
FirstProblem()

}