package T20



fun showBiggerNumber() {
    fun mayor (x1: Int, x2: Int) = if (x1 > x2) x1 else x2
        for (i in 1..5) {
            print("Introduce el primer valor:")
            val valor1 = readLine()!!.toInt()
            print("Introduce el segundo valor:")
            val valor2 = readLine()!!.toInt()
            println("El mayor entre $valor1 y $valor2 es ${mayor(valor1, valor2)}")
        }


    }

fun main(parametro: Array<String>) {
    showBiggerNumber()
}




