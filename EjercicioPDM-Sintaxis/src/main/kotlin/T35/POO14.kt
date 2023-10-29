package T35

data class Article(val codigo: Int, val descripcion: String, var precio: Float)
fun show(article: Array<Article>) {
    for(articulo in article)
        println("Código: ${articulo.codigo}  Descripción ${articulo.descripcion} Precio: ${articulo.precio}")
}
fun upPrice(articulos: Array<Article>) {
    for(articulo in articulos)
        articulo.precio = articulo.precio + (articulo.precio * 0.10f)
}
fun main(parametro: Array<String>) {
    val articulos: Array<Article> = arrayOf(Article(1, "papas", 7.5f),
        Article(2, "manzanas", 23.2f),
        Article(1, "naranjas", 12f),
        Article(1, "cebolla", 21f))
    println("Listado de precios actual")
    show(articulos)
    upPrice(articulos)
    println();
    println("Listado de precios con aumento del 10%")
    show(articulos)
}
