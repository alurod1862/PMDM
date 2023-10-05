package T9

private var FirstNumber:Int=0
private var SecondNumber:Int=0


private fun DataToAsk(){
    println("Introduce el numero de empleados: ")
    FirstNumber = readLine()!!.toInt()
}

private fun Resolution(){
    var x=0
    var salaryheight300=0
    var salarydown300=0
    while (FirstNumber > x){
        println("Introduce el suledo: ")
        SecondNumber = readLine()!!.toInt()
        if (SecondNumber in 100..300){
            salarydown300++
        }else if(SecondNumber in 300..499){
                salaryheight300++
        }else if (SecondNumber > 500){
            println("Salario no valido")
            break
        }
        x++
    }

    println("Hay $salarydown300 salario que esta entre 100$-300$ y $salarydown300 mayor a 300$ ")
}

fun main() {
    DataToAsk()
    Resolution()
}