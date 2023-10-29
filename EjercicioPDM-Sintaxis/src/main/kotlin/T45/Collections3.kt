package T45

fun main(args: Array<String>) {
    val lista = List(100, { ((Math.random() * 21)).toInt() })
    println(lista)
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    lista.forEach { when(it) {
        in 1..4 -> cant1++
        in 5..8 -> cant2++
        in 10..13 -> cant3++
    } }
    println("Cantidad de valores  entre 1..4: $cant1")
    println("Cantidad de valores  entre 5..8: $cant2")
    println("Cantidad de valores  entre 10..13: $cant1")
    if (lista.contains(20)){
        println("La lista tiene el 20")}
    else{
        println("La lista no tiene el 20")}
}
