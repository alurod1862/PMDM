package T17


private fun large(nane:String) = nane.length


private fun operation(nombre1:String,nombre2:String){
    if (large(nombre1) == large(nombre2)){
        print("Los nombres: $nombre1 y $nombre2 tienen la misma cantidad de caracteres")}
    else{
        if (large(nombre1) > large(nombre2))
            print("$nombre1 es mas largo")
        else
            print("$nombre2 es mas largo")}
}

fun main() {
    print("Ingrese un nombre:")
    val nombre1 = readLine()!!
    print("Ingrese otro nombre:")
    val nombre2 = readLine()!!
    operation(nombre1,nombre2)
}