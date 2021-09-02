package Desemp.Desemp6;

public class Prueba {
    public static void main(String[] args) {
        Persona persona1= new Persona();
        persona1.cargaDatos();

        Empleado empleado1 = new Empleado();
        empleado1.cargaDatos();
        empleado1.cargaSueldo();

        persona1.imprimirDatos();
        empleado1.imprimirDatos();
        empleado1.imprimirSueldo();
    }
}
