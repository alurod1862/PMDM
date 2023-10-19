package T26

class JuegoDeDados {


    val dado1 = Dado(2)
    val dado2 = Dado(1)
    val dado3 = Dado(4)


    fun jugar(){
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("Ganó")
        else
            print("Perdió")
        }

}