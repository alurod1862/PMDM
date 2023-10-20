package T30

import T15.cargarSumar

enum class TipoCarta(){
    DIAMAMNTE,
    TREBOL,
    CORAZON,
    PICA
}


class Carta(val tipo:TipoCarta,val valor:Int){

    fun imprimir(){
        println("Carta: $tipo y su valor $valor")
    }

}


fun main() {
    val carta1 = Carta(TipoCarta.DIAMAMNTE,6)
    carta1.imprimir()
}