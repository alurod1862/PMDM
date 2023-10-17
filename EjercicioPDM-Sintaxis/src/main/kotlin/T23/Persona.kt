package T23

class Persona {
    var nombre:String=""
    var edad:Int=0

    fun incializar(nombre:String,edad:Int){
        this.nombre = nombre
        this.edad = edad
    }

    fun mostra(){
        println("Nombre es $nombre y la edad $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }

}


