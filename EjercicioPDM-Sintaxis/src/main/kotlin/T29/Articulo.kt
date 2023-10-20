package T29

data class Articulo(var codigo:Int,var descripcion:String,var precio:Float)



fun main(parametro :Array<String>) {
    val articulo1 = Articulo(33,"Fernando Alonso",33f)
    val articulo2 = Articulo(6,"Iker",6f)
    println(articulo1)
    val puntero = articulo1
    puntero.codigo = 3
    println(articulo1)
    var articulo3 = articulo2.copy()
    println(articulo3)

}