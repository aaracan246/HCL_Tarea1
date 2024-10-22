package org.example

class EjKotlin {
    fun ej1(): MutableList<String>{
        val name = "Puck"
        var hp = 15
        val race = "Fairy"
        val atributeList = mutableListOf(name, hp.toString(), race)

        println(atributeList)
        return atributeList
    }

    fun ej2(){
        val energia = 80
        val estado = if(energia > 50) "El personaje está potente" else "El personaje está debilucho"
        println(estado)
    }

    fun ej3(){
        val chest = listOf("espada", "bastón", "arco")

        chest.forEach { println(it) }
    }

    fun ej4(){
        val rango = (1..20)
        for (num in rango){
            num + 1

            if (num == 13){
                println("te falta calle ;)")
            }
        }
    }

    fun ej5(){
        class Cleric(val name: String,
                     val maxHp: Int,
                     var currentHealth: Int){

            fun attack(): Int{ return 1 }
        }
    }

    fun ej6(){
        var personaje: String? = null
        if (personaje != null){
            println("El personaje se llama $personaje.")
        }
        else{
            println("No existe el personaje.")
        }
    }

    fun ej7(){
        val chest = listOf("Sword", "Staff", "Bow")

        chest.forEach{ if (it.contains("S")){ println(it) } }
    }

    // Ej8 en directorio ej8

}