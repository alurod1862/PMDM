package T27

import kotlin.time.times

class Vector {

    private val vector = IntArray(5)
    init {
        cargar()
    }


    private fun cargar(){
        for (i in vector.indices){
            vector[i]  = ((Math.random() *11)).toInt()
        }
    }


    fun imprimir(){
        for (i in vector.indices){
            println(vector[i])
        }
    }


    fun mostrarMayor() {
        var mayor = vector[0]
        for(i in vector.indices)
            if (vector[i] > mayor)
                mayor = vector[i]
        println("El elemento mayor del arreglo es $mayor")
    }
    fun mostrarMenor() {
        var menor = vector[0]
        for(i in vector.indices)
            if (vector[i] < menor)
                menor = vector[i]
        println("El elemento menor del arreglo es $menor")
    }


}