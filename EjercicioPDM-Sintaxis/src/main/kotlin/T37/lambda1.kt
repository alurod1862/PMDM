package T37

private fun operartion(firstNumber: Int, secondNumber: Int, fn: (Int, Int) -> Int) : Int{
    return fn(firstNumber, secondNumber)
}
fun main(parametro: Array<String>) {
    val sum = operartion(2, 3, {x, y -> x + y})
    println(sum)
    val resta = operartion(12, 2, {x, y -> x - y})
    println(resta)
    var raise = operartion(2, 4, {x, y ->
        var valor = 1
        for(i in 1..y)
            valor = valor * x
        valor
    })
    println(raise)
}