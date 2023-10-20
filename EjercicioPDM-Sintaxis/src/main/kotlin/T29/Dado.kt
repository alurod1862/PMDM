package T29

data class Dado(var valor:Int){
    override fun toString(): String {
        var cadena = ""
        for(i in 1..valor)
            cadena = cadena +"*"
        return cadena
    }
}


fun main() {
    val dado1 = Dado(5)
    println(dado1)}