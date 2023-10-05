package T4

fun FirstProblem(){
    print("Introduce un numero: ")
    val FirstNumber = readLine()!!.toInt()
    println(FirstNumber)
    print("Introduce un numero: ")
    val SecondNumber = readLine()!!.toInt()
    println(SecondNumber)
    val suma= FirstNumber + SecondNumber
    println("La suma de $FirstNumber y $SecondNumber es $suma")
}

fun SecondProblem(){
    print("Introduce el lado de un cuadrado para saber su perimetro: ")
    val CubePerimeter = readLine()!!.toInt()
    val Result=CubePerimeter *4
    println("El perimetro es $Result")
}

fun ThirdProblem(){
    print("Introduce el precio del articulo: ")
    val PriceProduct = readLine()!!.toFloat()
    print("Introduce la cantidad de articulos: ")
    val NumberOfProducts = readLine()!!.toInt()
    val resultado = PriceProduct * NumberOfProducts
    println("El total a pagar es $resultado")

}

fun FourProblem(){
    print("Ingrese primer valor:")
    val v1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val v2 = readLine()!!.toInt()
    print("Ingrese tercer valor:")
    val v3 = readLine()!!.toInt()
    print("Ingrese cuarto valor:")
    val v4 = readLine()!!.toInt()
    val suma = v1 + v2
    println("La suma de $v1 y $v2 es $suma")
    val producto = v3 * v4
    println("El producto de $v3 y $v4 es $producto")
}


fun FiveProblem(){
    print("Ingrese primer valor:")
    val v1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val v2 = readLine()!!.toInt()
    print("Ingrese tercer valor:")
    val v3 = readLine()!!.toInt()
    print("Ingrese cuarto valor:")
    val v4 = readLine()!!.toInt()
    val suma = v1 + v2 + v3 + v4
    println("La suma de los cuatro valores es $suma")
    val prom = suma / 4
    println("El promedio de los cuatro valores es $prom")
}


fun main(){

    //FirstProblem()
    //SecondProblem()
    //ThirdProblem()
    FourProblem()

}