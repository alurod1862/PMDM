package T9

private var Number:Int=0
private var FirstList:Int=0
private var Secondlist:Int=0


private fun Resolution(){

    var x=0

    while (x<5){
        println("Introduce un numero para la primera lista: ")
        Number = readLine()!!.toInt()
        FirstList+=Number
        x++
    }
    x=0
    println("----------------------------------------------------")
    while (x<5){
        println("Introduce un numero para la segunda lsita: ")
        Number = readLine()!!.toInt()
        Secondlist+=Number
        x++
    }

    if (FirstList > Secondlist){
        println("La lista 1 es mayor")
    }else if (FirstList == Secondlist){
        println("La listas iguales")
    }else{
        println("La lista 2 es mayor")
    }

}

fun main() {
    Resolution()
}