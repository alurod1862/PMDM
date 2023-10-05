package T9

private var Number:Int=0
private var inpeers:Int=0
private var Peers:Int=0

private fun Resolution(){

    var x=0

    while (x<5){
        println("Introduce un numero: ")
        Number = readLine()!!.toInt()
        if (Number % 2 == 0 ){
            Peers++
        }else{
            inpeers++
        }
        x++
    }

    println("Hay $Peers numeros pares y $inpeers inpares")

}

fun main() {
    Resolution()
}