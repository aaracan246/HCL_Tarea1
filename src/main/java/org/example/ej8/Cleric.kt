package org.example

class Cleric(hp: Int, dps: Int): Character(hp, dps), IAttack {

    override fun attack(): Int {
        return dps
    }

    fun heal(){
        val hpUp = 2
        hp += hpUp
    }
}
