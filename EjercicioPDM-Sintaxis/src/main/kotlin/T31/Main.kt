package T31



fun main() {
   val dado = object {
       val cantidad = IntArray(5)
       fun genera(){
           for (i in cantidad.indices){
               cantidad[i] = (Math.random() *6).toInt()
           }
       }

    fun imprimr(){
        for (elemento in cantidad){
            println("$elemento")
            println("")
        }
        }

       fun mayor(): Int {
           var may = cantidad[0]
           for(i in cantidad.indices)
               if (cantidad[i] > may)
                   may = cantidad[i]
           return may
       }
       }


    dado.genera()
    dado.imprimr()
    println("Valor mayor")
    println(dado.mayor())


   }


