/*Confeccionar una clase Persona que tenga como atributos el nombre y la
        edad.
        | Definir como responsabilidades un método que cargue los datos
        personales y otro que los imprima.
        | Plantear una segunda clase Empleado que herede de la clase Persona.
        | Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su
        sueldo.
        | Definir un objeto de la clase Persona y llamar a sus métodos.
        | Por último, crear un objeto de la clase Empleado y llamar a sus métodos.*/

package Desemp.Desemp6;

import java.util.Scanner;

public class Persona {
    protected Scanner teclado;
    protected String nombre;
    protected int edad;



    public Persona() {
        teclado = new Scanner(System.in);
    }

    public void cargaDatos() {
        System.out.println("Ingrese nombre de empleado: ");
        nombre = teclado.next();
        System.out.println("Ingrese edad del empleado: ");
        edad = teclado.nextInt();
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
