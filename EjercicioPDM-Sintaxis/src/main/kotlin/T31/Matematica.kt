package T31

object Matematica {

    val PI=3.1416

    fun aleatorio(minimo: Int, maximo: Int) = ((Math.random() * (maximo + 1 -
            minimo)) + minimo).toInt()

}