package ejercicio2;

import java.util.Scanner;

public class Principal {

    // variable tipo scanner

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Gato gato1 = pedirDatosGato();

        System.out.println(gato1.hacerSonido());
        gato1.cazarRaton();
        gato1.treparArbol();
        System.out.println(gato1.toString());
        ;

        Perro perro1 = pedirDatosPerro();
        perro1.correr();
        perro1.jugar();
        System.out.println(perro1.hacerSonido());
        System.out.println(perro1.toString());
        ;
    }

    public static Perro pedirDatosPerro() {

        String nombre, raza;
        int edad;

        System.out.println("\n*.*.*.*.*.*...**INGRESADO DATOS DEL PERRITO *.*.*.*.*.*.*\n");
        System.out.println("Ingrese nombre: ");
        nombre = in.next();
        System.out.println("Ingrese edad: ");
        edad = in.nextInt();
        System.out.println("Ingrese raza: ");
        raza = in.next();

        System.out.println("\n*.*.*.*.*.*...*.*.*.*.*.*.*.*.*.*.*.*.*.*\n");

        return new Perro(nombre, edad, raza);
    }

    public static Gato pedirDatosGato() {

        String nombre, colorPelo;
        int edad;

        System.out.println("\n*.*.*.*.*.*...**INGRESADO DATOS DEL GATITO *.*.*.*.*.*.*\n");
        System.out.println("Ingrese nombre: ");
        nombre = in.next();
        System.out.println("Ingrese edad: ");
        edad = in.nextInt();
        System.out.println("Ingrese color Pelo: ");
        colorPelo = in.next();
        System.out.println("\n*.*.*.*.*.*...*.*.*.*.*.*.*.*.*.*.*.*.*.*\n");
        return new Gato(nombre, edad, colorPelo);

    }
}
