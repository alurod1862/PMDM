package T25

class Operaciones {
    var firstValue = 0
    var seconfValue = 0


    fun cargar() {
        print("Ingrese primer valor:")
        firstValue = readLine()!!.toInt()
        print("Ingrese segundo valor:")
        seconfValue = readLine()!!.toInt()
        sumar()
        restar()
    }
    fun sumar() {
        val suma = firstValue + seconfValue
        println("La suma de $firstValue y $seconfValue es $suma")
    }
    fun restar() {
        val resta = firstValue - seconfValue
        println("La resta de $firstValue y $seconfValue es $resta")
    }

}