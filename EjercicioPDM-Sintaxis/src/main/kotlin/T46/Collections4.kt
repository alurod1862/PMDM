package T46

data class Data(val day: Int, val month: Int, val year: Int)
private fun chargeData(diary: MutableMap<Data, String>) {
    do {
        println("Ingresa fecha")
        print("Ingresa el día:")
        val day = readLine()!!.toInt()
        print("Ingresa el mes:")
        val month = readLine()!!.toInt()
        print("Ingresa el año:")
        val year = readLine()!!.toInt()
        print("Ingresa todas las actividades para ese día:")
        val actividades = readLine()!!
        diary[Data(day, month, year)] = actividades
        print("Ingresa otra fecha (si/no):")
        val opcion = readLine()!!
    } while (opcion == "si")
}
private fun show(diary: MutableMap<Data, String>) {
    for((data, activity) in diary) {
        println("Fecha ${data.day}/${data.month}/${data.year}")
        println("Actividades: $activity")
        println()
    }
}
private fun consultData(diary: MutableMap<Data, String>) {
    println("Ingresa una fecha a consultar")
    print("Ingresa el día:")
    val day = readLine()!!.toInt()
    print("Ingresa el mes:")
    val month = readLine()!!.toInt()
    print("Ingresa el año:")
    val year = readLine()!!.toInt()
    val data = Data(day, month, year)
    if (data in diary)
        println("Actividades: ${diary[data]}")
    else
        println("No existen actividades registradas para esa fecha")
}
fun main(args: Array<String>) {
    val diary: MutableMap<Data, String> = mutableMapOf()
    chargeData(diary)
    show(diary)
    chargeData(diary)
}