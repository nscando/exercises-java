/*Desarrollar un programa que cargue los lados de un triángulo e implemente los siguientes métodos:
        | inicializar los atributos,
        | imprimir el valor del lado mayor
        | y otro método que muestre si es equilátero o no.*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    private Scanner teclado;
    private int lado1, lado2, lado3;

    public void inicializar() {
        teclado = new Scanner(System.in);

        System.out.println("Ingrese medida lado 1: ");
        lado1= teclado.nextInt();

        System.out.println("Ingrese medida lado 2: ");
        lado2= teclado.nextInt();

        System.out.println("Ingrese medida lado 3: ");
        lado3= teclado.nextInt();

    }

    public void esMayor(){
        System.out.println("Lado Mayor: ");
        if (lado1 > lado2 && lado1> lado3){
            System.out.println(lado1);
        }else {
            if (lado2>lado3){
                System.out.println(lado2);
            }else{
                System.out.println(lado3);
            }
        }
    }

    public void esEquilatero(){
        if (lado1 == lado2 && lado1== lado3){
            System.out.println("El triangulo es equilatero.");
        }else {
            System.out.println("No es equilatero.");
        }

    }

    public static void main(String[] args) {
        Ejercicio2 triangulo1=new Ejercicio2();
        triangulo1.inicializar();
        triangulo1.esMayor();
        triangulo1.esEquilatero();

    }
}
