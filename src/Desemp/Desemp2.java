package Desemp;

import java.util.Scanner;

public class Desemp2 {
    private Scanner teclado;
    private int a, b, total;

    public void inicializar() {
        teclado = new Scanner(System.in);

        System.out.println("Ingrese valor de A: ");
        a= teclado.nextInt();

        System.out.println("Ingrese valor de B: ");
        b= teclado.nextInt();

    }

    public void suma() {
        total = a+b;
        System.out.println("La suma  A + B es: "+total);
    }

    public void resta() {
        total = a-b;
        System.out.println("La resta  A - B es: "+total);
    }

    public void division() {
        total = a/b;
        System.out.println("La division  A / B es: "+total);
    }

    public void multiplicacion() {
        total = a*b;
        System.out.println("La multiplicacion  A * B es: "+total);
    }

    public static void main(String[] args) {
        Desemp2 desemp2 = new Desemp2();
        desemp2.inicializar();
        desemp2.suma();
        desemp2.resta();
        desemp2.division();
        desemp2.multiplicacion();
    }
}
