package T11


private var FirstNumber:Int = 0
private var PointX:Int=0
private var PointY:Int=0
private var Quadrant1:Int=0
private var Quadrant2:Int=0
private var Quadrant3:Int=0
private var Quadrant4:Int=0
private fun DataToAsk(){
    println("Cantidad de puntos a ingresar: ")
    FirstNumber = readLine()!!.toInt()
}


private fun DataToAskPointsX(){
    println("Introduce coordendas X: ")
    PointX = readLine()!!.toInt()
}

private fun DataToAskPointsY(){
    println("Introduce coordendas Y: ")
    PointY = readLine()!!.toInt()
}

private fun Resolution() {
    for (i in 1..FirstNumber){
        DataToAskPointsX()
        DataToAskPointsY()

        if (PointX > 0 && PointY > 0)
            Quadrant1++
        else
            if (PointX < 0 && PointY > 0)
                Quadrant2++;
            else
                if (PointX < 0 && PointY < 0)
                    Quadrant3++
                else
                    if (PointX > 0 && PointY < 0)
                        Quadrant4++
    }
}


private fun Result(){
    println("El primer cuadrante tiene $Quadrant1 puntos")
    println("El primer cuadrante tiene $Quadrant2 puntos")
    println("El primer cuadrante tiene $Quadrant3 puntos")
    println("El primer cuadrante tiene $Quadrant4 puntos")
}

fun main() {
    DataToAsk()
    Resolution()
    Result()
}