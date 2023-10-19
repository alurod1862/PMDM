package T26

class Banco {


    val clinete1 = Cliente("Iker",33f)
    val cliente2 = Cliente("Isaac",0.33f)
    val cliente3 = Cliente("Oscar",3f)

    fun depositar(){
        clinete1.deposito(100f)
        cliente2.deposito(300f)
        cliente3.deposito(222f)
    }


    fun extraer(){
        clinete1.extracciones(50f)
        cliente2.extracciones(3f)
        cliente3.extracciones(0f)
    }

    fun total(){
        val total = clinete1.monto + cliente2.monto + cliente3.monto
        println("El total de dinero del banco es: $total")
        clinete1.extracto()
        cliente2.extracto()
        cliente3.extracto()
    }


}

