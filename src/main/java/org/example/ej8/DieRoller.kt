package org.example

class DieRoller {

    fun rollDie(): Int {
        val num = (1..20).random()

        return num
    }
}