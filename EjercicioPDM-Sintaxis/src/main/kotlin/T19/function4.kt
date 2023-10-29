package T19



fun board(numero: Int, terminos: Int = 10) {
    for(i in numero..numero*terminos step numero)
        println(i)
}
fun main(parametro: Array<String>) {
    println("Tabla del 3")
    board(3)
    println("Tabla del 3 con 5 terminos")
    board(3, 5)
    println("Tabla del 3 con 20 terminos")
    board(terminos = 20, numero = 3)
}