package T5


var salary:Int=0

private fun DataToAsk(){
    print("Introduce el sueldo: ")
    salary = readLine()!!.toInt()
}

private fun Resolution(){
    if (salary>3000){
        println("Tienes que pagar impuestos")
    }else{
        println("No tiene que pagar impuestos")
    }
}

private fun FirstProblem(){
    DataToAsk()
    Resolution()
}

fun main(){

    FirstProblem()
}