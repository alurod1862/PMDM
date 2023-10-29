package T21

private val vector = IntArray(8)
private var allValue:Int=0
private var valueUp36:Int=0
private var valueUp50:Int=0


private fun  chargeData(){
    for(i in vector.indices-1){
        println("Introduce un numero: ")
        vector[i] = readln()!!.toInt()
    }
}


private fun operation(){
    for(i in vector){
        allValue += vector[i]
        if (i > 36){
            valueUp36 += i
        }
        if ( i > 50){
            valueUp50 += i
        }
    }
}


fun main() {
    chargeData()
    operation()
    println("Valor acumulado $allValue")
    println("Valor acumulado de numeros mayores a 36 $valueUp36")
    println("Valor acumulado de numeros mayores a 36 $valueUp50")

}