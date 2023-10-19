package T26

class Cliente (var nombre:String,var monto:Float){

    fun deposito(monto: Float){
        this.monto += monto
    }


    fun extracciones(monto: Float){
        this.monto -= monto
    }


    fun extracto(){
        println("La persona $nombre tiene un deposito de $monto")
    }

}