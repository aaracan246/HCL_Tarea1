package org.example;

public class Ej7 {
    public void ej7(){

        System.out.println(multiplicar(5));

        // Lambda en Java (requiere interfaz funcional)
        Operacion operacion = (a, b) -> a + b;
        System.out.println(operacion.sumar(3, 4));
    }
    public static int multiplicar(int num) {
        return num * 2;
    }
    interface Operacion {
        int sumar(int a, int b);
    }
}
