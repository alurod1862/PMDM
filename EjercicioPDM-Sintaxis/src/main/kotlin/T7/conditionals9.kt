package T7

private var FirstStudent:Int=0
private var SecondStudent:Int=0
private var ThirdStudent:Int=0

private fun DataToAsk(){
    println("Introduce la nota del primer alumno: ")
    FirstStudent = readLine()!!.toInt()
    println("Introduce la nota del segundo alumno: ")
    SecondStudent = readLine()!!.toInt()
    println("Introduce la nota del tercer alumno: ")
    ThirdStudent = readLine()!!.toInt()
}

private fun Resolution(){
    var average:Int = (FirstStudent + SecondStudent + ThirdStudent)/3
    if (average >= 4){
        if (average >= 7){
            println("Promocionado")
        }else{
            println("Regular")
        }
    }else{
        println("Reprobado")
    }

}

fun main() {
    DataToAsk()
    Resolution()

}