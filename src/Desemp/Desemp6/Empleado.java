package Desemp.Desemp6;

import java.util.Scanner;

public class Empleado extends Persona {
    protected int sueldo;

    public void cargaSueldo(){
        teclado= new Scanner(System.in);

        System.out.println("Ingrese sueldo del empleado: ");
        sueldo= teclado.nextInt();
    }

    public void imprimirSueldo(){
        System.out.println("Sueldo: "+ sueldo);
    }

}
