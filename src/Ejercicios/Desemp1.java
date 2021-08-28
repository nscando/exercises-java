/*Confeccionar una clase que represente un empleado. Definir como
        atributos su nombre y su sueldo.
        | Confeccionar los métodos para la carga, otro para imprimir sus datos
        y por último uno que imprima un mensaje en caso que deba pagar
        impuestos (si el sueldo supera a los $3000).*/

package Ejercicios;

import java.util.Scanner;

public class Desemp1 {

    private Scanner teclado;
    private String nombre;
    private int sueldo;

    public void inicializar() {
        teclado = new Scanner(System.in);

        System.out.println("Ingrese nombre de empleado: ");
        nombre = teclado.nextLine();

        System.out.println("Ingrese valor de sueldo: $");
        sueldo = teclado.nextInt();
    }

    public void imprimirDatos() {
        System.out.println("El nombre del empleado ingresado es: " + nombre);
        System.out.println("El sueldo del empleado ingresado  es: $ " + sueldo);
    }

    public void impuestos() {
        if (sueldo > 3000) {
            System.out.println("El sueldo de este empleado tributa impuestos.");
        }else{
            System.out.println("El sueldo de este emplado no tributa impuestos");
        }
    }

    public static void main(String[] args) {
        Desemp1 empleado = new Desemp1();
        empleado.inicializar();
        empleado.imprimirDatos();
        empleado.impuestos();
    }
}
