package T23

class Triangulo {

    var lado1:Int=0
    var lado2:Int=0
    var lado3:Int=0


    fun inicializarTriangulo(lado1:Int,lado2:Int,lado3:Int){
        this.lado1=lado1
        this.lado2=lado2
        this.lado3=lado3
    }


    fun mostraLadoMasGrande(){
        if (lado1 > lado2 && lado1 > lado3){
            println("El lado mas grande es el lado $lado1")
        }else if(lado2 > lado3 && lado2 > lado1){
            println("El lado mas grande es el lado $lado2")
        }else{
            println("El lado mas grande es el lado $lado3")
        }
    }

    fun equilatero(){
            if (lado1 == lado2 && lado2 == lado3){
                println("Triangulo equilatero")
            }else{
                println("Triangulo no equilatero")
            }
    }


}