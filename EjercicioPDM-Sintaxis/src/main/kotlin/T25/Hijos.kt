package T25

class Hijos {
    var edades = IntArray(5)

    fun cargar(){
        for (i in edades.indices) {
            println("Introduce la edad: ")
            edades[i] = readln()!!.toInt()
        }
        edadMayor()
        edadPromedio()
    }


    fun edadMayor(){
        var edad = 0
        for (i in edades.indices){
            if (edades[i] > edad){
                edad = edades[i]
            }
        }
        println("La edad mayor es $edad")
    }

    fun edadPromedio(){
        var promedio =0
        for (i in edades.indices){
            promedio += edades[i]
        }
        var resultado = promedio/edades.size
        println("La edad promedio es $resultado")
    }

}