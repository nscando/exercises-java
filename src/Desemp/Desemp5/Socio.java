/*| Plantear una clase Club y otra clase Socio.
        | La clase Socio debe tener los siguientes atributos privados: nombre
        y antigüedad en el club (en años).
        | En el constructor pedir la carga del nombre y su antigüedad.
        | La clase Club debe tener como atributos 3 objetos de la clase Socio.
        | Definir una responsabilidad para imprimir el nombre del socio con mayor
        antigüedad en el club.*/

package Desemp.Desemp5;

import java.util.Scanner;

public class Socio {

    private String nombre;
    private int antiguedad;

    public Socio(Scanner teclado) {

        System.out.println("Ingrese nombre del socio: ");
        nombre = teclado.next();

        System.out.println("Ingrese antiguedad del socio: ");
        antiguedad = teclado.nextInt();
    }

    public void imprimir() {
        System.out.println("El Nombre del socio con mayor antiguedad es: " + nombre + " " + " y su antiguedad es de: " + antiguedad+ " "+ "años.");
    }

    public String retornarNombre() {
        return nombre;
    }

    public int retornarAntiguedad() {
        return antiguedad;
    }
}
