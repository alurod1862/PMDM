package T24

class Alumno {

    var nombre:String=""
    var nota:Int=0

    fun inicializa(nombre:String,nota:Int){
        this.nombre = nombre
        this.nota = nota
    }


    fun mostrarAlumno(){
        println("El alumno $nombre tiene un $nota")
    }

    fun mostrarEstado () {
        if (nota >= 4)
            println("$nombre se encuentra en estado REGULAR")
        else
            println("$nombre no está REGULAR")
    }



}