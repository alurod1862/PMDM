package T39


class Dado (var valor: Int = 1){
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }
    fun imprimir() {
        println("Valor del dado: $valor")
    }
}



fun main(parametro: Array<String>) {
    var dados: Array<Dado> = arrayOf(Dado(), Dado(), Dado(), Dado(), Dado())
    for(dado in dados)
        dado.tirar()
    for(dado in dados)
        dado.imprimir()
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    var cant4 = 0
    var cant5 = 0
    var cant6 = 0
    dados.forEach {
        when (it.valor) {
            1 -> cant1++
            2 -> cant2++
            3 -> cant3++
            4 -> cant4++
            5 -> cant5++
            6 -> cant6++
        }
    }
    println("Cantidad de dados que tienen el valor 1: $cant1")
    println("Cantidad de dados que tienen el valor 2: $cant2")
    println("Cantidad de dados que tienen el valor 3: $cant3")
    println("Cantidad de dados que tienen el valor 4: $cant4")
    println("Cantidad de dados que tienen el valor 5: $cant5")
    println("Cantidad de dados que tienen el valor 6: $cant6")
}










