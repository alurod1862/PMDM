package T9

private var FirstNumber:Int=0


private fun Resolution(){

    var n=0
    var markupseven=0
    var markdownseven=0
    while (n < 10){
        println("Introduce una nota: ")
        FirstNumber = readLine()!!.toInt()
        if (FirstNumber>=7){
            markupseven++
        }else{
            markdownseven++
        }
        n++
    }
    println("Hay $markupseven mayores a 7 y $markdownseven menores a 7")

}

fun main() {
    Resolution()
}