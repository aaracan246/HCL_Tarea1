package org.example

class Fighter(hp: Int, dps: Int): Character(hp, dps), IAttack {

    override fun attack(): Int {
        return dps
    }

    fun actionSurge(){
        attack()
    }
}
