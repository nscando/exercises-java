/*Desarrollar una clase que represente un punto en el plano y tenga los siguientes métodos:
        | cargar los valores de x e y,
        | imprimir en qué cuadrante se encuentra dicho punto (concepto matemático: primer cuadrante si x
        e y son positivas, si x<0 e y>0 segundo cuadrante, etc.)*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    private Scanner teclado;
    private int x, y;


    public void inicializar() {
        teclado = new Scanner(System.in);

        System.out.println("Ingrese valor de X: ");
        x = teclado.nextInt();
        System.out.println("Ingrese valor de Y: ");
        y = teclado.nextInt();
    }

    public void imprimirCuadrante() {
        if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el PRIMER CUADRANTE.");
        } else {
            if (x < 0 && y > 0) {
                System.out.println("El punto se encuentra en el SEGUNDO CUADRANTE.");
            } else {
                if (x < 0 && y < 0) {
                    System.out.println("El punto se encuentra en el TERCER CUADRANTE.");
                } else {
                    if (x > 0 && y < 0) {
                        System.out.println("El punto se encuentra en el CUARTO CUADRANTE.");
                    } else {
                        System.out.println("El punto no se encuentra dentro del cuadrante");
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Ejercicio3 punto = new Ejercicio3();
        punto.inicializar();
        punto.imprimirCuadrante();
    }

}
