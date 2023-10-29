package T33

abstract class Cuenta(val titular: String, val cantidad: Double) {
    open fun imprimir() {
        println("Titular: $titular")
        println("Monto: $cantidad")
    }
}
class CajaAhorro(titular: String, cantidad: Double): Cuenta(titular, cantidad) {
    override fun imprimir() {
        println("Cuenta de caja de ahorro")
        super.imprimir()
    }
}
class PlazoFijo(titular: String, cantidad: Double, val plazo: Int, val interes: Double): Cuenta(titular,
    cantidad) {
    override fun imprimir() {
        println("Cuenta de plazo fijo")
        println("Plazo en dias: $plazo")
        println("Intereses: $interes")
        val ganancia = cantidad * interes / 100
        println("Importe del interes: $ganancia")
        super.imprimir()
    }
}
fun main(parametro: Array<String>) {
    val cajaAhorro1 = CajaAhorro("Iker", 33.3)
    cajaAhorro1.imprimir()
    val plazoFijo1 = PlazoFijo("Isaac", 3333.3, 33, 1.33)
    plazoFijo1.imprimir()
}