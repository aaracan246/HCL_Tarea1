package org.example;

public class Ej5Personaje{
    String name;
    int hp;

    public Ej5Personaje(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + name + ", health: " + hp + ".");
    }
}
