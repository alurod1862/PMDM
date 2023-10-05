package T12


private var PointX:Int=0
private var PointY:Int=0

private fun DataToAskPointsX(){
    println("Introduce coordendas X: ")
    PointX = readLine()!!.toInt()
}

private fun DataToAskPointsY(){
    println("Introduce coordendas Y: ")
    PointY = readLine()!!.toInt()
}

private fun Resolution() {

    DataToAskPointsX()
    DataToAskPointsY()
    when{
        PointX > 0 && PointY > 0 -> println("Estas en el primer cuadrante")
        PointX < 0 && PointY > 0 -> println("Estas en el segundo cuadrante")
        PointX < 0 && PointY < 0 -> println("Estas en el terceer cuadrante")
        PointX > 0 && PointY < 0 -> println("Estas en el cuarto cuadrante")
        else -> println("El punto se encuentra en un eje")
    }


}
fun main() {
    Resolution()
}