package ejercicio1;

import java.util.Scanner;

public class Principal {

    // crear mi variable estatica de tipo Scanner

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("PEDIR DATOS Y CRENDO A CHOFER : !!!!");

        Chofer chofer1 = pedirDatosChofer();
        chofer1.accion();
        System.out.println("PEDIR DATOS Y CRENDO A PASAJERO : !!!!");

        Pasajero pasajero1 = pedirDatosPasajero();
        pasajero1.accion();

    }

    public static Chofer pedirDatosChofer() {

        String nombre, cedula, numeroPlaca, codTaxi;
        int edad;
        System.out.println("Ingrese nombre: ");
        nombre = in.next();
        System.out.println("Ingrese cedula: ");
        cedula = in.next();
        System.out.println("Ingrese edad: ");
        edad = in.nextInt();
        System.out.println("Ingrese numeroPlaca: ");
        numeroPlaca = in.next();
        System.out.println("Ingrese codTaxi: ");
        codTaxi = in.next();

        return new Chofer(nombre, edad, cedula, numeroPlaca, codTaxi);
    }

    public static Pasajero pedirDatosPasajero() {

        String nombre, cedula, numeroID;
        int edad;
        System.out.println("Ingrese nombre: ");
        nombre = in.next();
        System.out.println("Ingrese cedula: ");
        cedula = in.next();
        System.out.println("Ingrese edad: ");
        edad = in.nextInt();
        System.out.println("Ingrese numeroID: ");
        numeroID = in.next();

        return new Pasajero(nombre, edad, cedula, numeroID);
    }

}
