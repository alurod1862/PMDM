package T26

class Club {

    val socio1 = Socio("Florentino",76)
    val socio2 = Socio("Iker",19)
    val socio3 = Socio("Isaac",19)

    fun socioConmayorAntiguedad(){
        if (socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad){
            println("El socio mas antiguo es ${socio1.nombre}")
        }else if(socio2.antiguedad > socio3.antiguedad){
            println("El socio mas antiguo es ${socio2.nombre}")

        }else{
            println("El socio mas antiguo es ${socio3.nombre}")
        }
    }

}

