package org.example.ejbasicosKotlin

fun main(){
    val ejerciciosBasicosKotlin = EjerciciosBasicosKotlin()

    ejerciciosBasicosKotlin.ej10SimulacionAtaqueEquipo()
}

class EjerciciosBasicosKotlin {

    fun ej1(){
        println("¡Hola, mundo!")
    }

    fun ej2VidaDeUnPj(){
        val vida = 100

        println("La vida del personaje es $vida.")
    }

    fun ej3MultiplicandoAtaques(num: Int): Int{

        return num * 5
    }

    fun ej4MonedasEnUnTesoro(){
        val moneda = 0

        for (i in 1..10){
            moneda + 5
            println(moneda)
        }
    }

    fun ej5PjLvl(){
        println("Please, insert the character's level: ")
        val nivelPj = readln().toIntOrNull()

        when{

            nivelPj in 1..10 -> println("Personaje principiante")

            nivelPj in 11..20 -> println("Personaje intermedio")

            nivelPj != null && nivelPj > 20 -> println("Personaje avanzado")

            else -> println("Nivel no válido")
        }
    }

    fun ej6BatallaDanioCritico(){
        val rollDmg = (1..100).random()

        if (rollDmg >= 50) {
            println(rollDmg * 2)
        }
        else{
            println(rollDmg)
        }
    }

    fun ej7CombateDosPjs(){
        // Resuelto en otro archivo

    }

    fun ej8InventarioObjetos(){

        val inventario: MutableList<String> = mutableListOf()
        val espada = "espada"
        val arco = "arco"

        val estoque = "estoque"
        val escudo = "escudo"
        val espadon = "espadón"
        inventario.add(estoque)
        inventario.add(escudo)
        inventario.add(espadon)

        println("Te has encontrado una espada, ¿qué deseas hacer con ella?")
        menuInventario(inventario, espada)

        println("Te has encontrado un arco, ¿qué deseas hacer con él?")
        menuInventario(inventario, arco)

        while (true){
            println("¿Desea hacer algo más?")
            menuInventario(inventario, "")
        }

    }

    private fun menuInventario(inventario: MutableList<String>, item: String){
        println("Por favor seleccione una opción: ")
        println("1. Añadir objeto")
        println("2. Eliminar objeto")
        println("3. Mostrar inventario")
        val opcion = readln().toIntOrNull()

        when (opcion) {
            1 -> inventario.add(item)

            2 -> {
                if (inventario.isEmpty()){
                    println("El inventario está vacío.")
                }
                else{

                    println("Por favor, seleccione la opción a eliminar: ")
                    println(inventario)
                    inventario.forEachIndexed{ index, item ->
                        println("${index + 1}. Remove: $item")
                        val opcion1 = readln().toIntOrNull()
                        if (opcion1 != null && opcion1 in 1..inventario.size) {
                            inventario.removeAt(opcion1 - 1)
                            println("El objeto ha sido eliminado con éxito.")
                        }
                        else{
                            println("Opción no válida.")
                        }
                    }
                }
            }
            3 -> {
                if (inventario.isEmpty()){ println("El inventario está vacío.") }
                else { println(inventario) }}
        }
    }

    fun ej9SistemaDeExp(){
        val hero = Hero("Morri", 100, 100, 20, 10, 0)
        val monster = Monster("Goblin", 20, 20, 5, 2)

        var turno = 0

        while (turno < 10){
            turno++

            println("Que los dioses decidan quién consigue golpear!!!")
            val dieRoller = (1..20).random()

            if (dieRoller >= 11){
                monster.currentHp -= hero.attack()
                println("${hero.name} ataca! El ${monster.name} recibe ${hero.attack} puntos de daño. Vida restante: ${monster.currentHp}.")
            }
            else{
                hero.currentHp -= monster.attack()
                println("${monster.name} ataca! El héroe ${hero.name} recibe ${monster.attack} puntos de daño. Vida restante: ${hero.currentHp}.")
            }

            if (monster.currentHp <= 0){
                hero.currentHp = hero.maxHp
                hero.exp += 50
                println("El ${monster.name} ha caído! Obtienes 50 puntos de experiencia. Tienes ${hero.exp} puntos.")

                println("Otro monstruo aparece!")
                monster.currentHp = monster.maxHp
            }

            println(". . .")

            if (hero.exp == 200){
                println("Subes de nivel!!!")
                break
            }
        }
    }
    fun ej10SimulacionAtaqueEquipo(){
        val heroe1 = Hero("Morri", 100, 95, 50, 10, 0)
        val heroe2 = Hero("Hellion", 150, 87, 65, 10, 0)

        val monster = Monster("Hydra", 500, 500, 5, 2)

        val ataqueCombinado = heroe1.attack + heroe2.attack

        var turno = 0

        while (turno < 10){
            turno++

            println("Los héroes atacan!")
            monster.currentHp -= ataqueCombinado
            println("La vida de la ${monster.name} baja a ${monster.currentHp}!")

            if (monster.currentHp <= 0){
                println("La ${monster.name} ha caído!")
                break
            }
        }

    }
}

class Hero(val name: String, val maxHp: Int, var currentHp: Int, val attack: Int, val armor: Int, var exp: Int){
    fun attack(): Int{
        return attack
    }
}

class Monster(val name: String, val maxHp: Int, var currentHp: Int, val attack: Int, val armor: Int){
    fun attack(): Int{
        return attack
    }
}