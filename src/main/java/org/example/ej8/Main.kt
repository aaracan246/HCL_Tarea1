package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val dieRoller = DieRoller()


    val cleric = Cleric(28, 8)
    val fighter = Fighter(26, 10)

    println("Let's see who goes first!!! (para nada trucado)")
    println("The fight has begun: ")
    for (num in 1..10){
        val die = dieRoller.rollDie()
        if (die >= 11){
            fighter.hp -= cleric.attack()
            println("The cleric attacks!! It deals ${cleric.dps} points of dmg to the figther! The fighter has ${fighter.hp} hp.")
            cleric.heal()
            println("The cleric heals for 2 points of health!")
        }

        else {
            cleric.hp -= fighter.attack()
            println("The fighter attacks!! It deals ${fighter.dps} points of dmg to the cleric! The cleric has ${cleric.hp} hp.")
            fighter.actionSurge()
            println("The fighter attacks again! It deals ${fighter.dps} points of dmg to the cleric! ")
        }

        if (cleric.hp <= 0) {
            println("The cleric has fallen!")
            break
        }
        if (fighter.hp <= 0){
            println("The fighter is down!")
            break
        }
    }

}