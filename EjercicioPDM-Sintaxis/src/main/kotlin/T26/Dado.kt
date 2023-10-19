package T26

class Dado (var valor:Int){

    fun tirar(){
        var valor = ((Math.random()*6)+1).toInt()
        imprimir()
    }


    fun imprimir(){
        println("Valor del dado $valor")
    }


}