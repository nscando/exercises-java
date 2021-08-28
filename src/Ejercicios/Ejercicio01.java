/*
* Confeccionar una clase que permita cargar el nombre y la edad de una persona.
| Mostrar los datos cargados.
| Imprimir un mensaje si es mayor de edad (edad>=18)
* */

package Ejercicios;

import java.util.Scanner;


public class Ejercicio01 {

    private Scanner teclado;
    private String nombre;
    private int edad;

    public void incializar() {
        teclado = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        nombre= teclado.next();

        System.out.println("Ingrese edad: ");
        edad= teclado.nextInt();
    }

    public void imprimir() {
        System.out.println("Nombre:"+nombre);
    }

    public void esMayorEdad(){
        if(edad>=18){
            System.out.println("Es mayor de edad!");
        }else {
            System.out.println("Es menor!");
        }
    }

    public static void main(String[] args) {
        Ejercicio01 persona1;
        persona1 = new Ejercicio01();
        persona1.incializar();
        persona1.imprimir();
        persona1.esMayorEdad();

    }
}

