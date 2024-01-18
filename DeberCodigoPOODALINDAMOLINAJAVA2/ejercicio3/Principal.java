package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static Scanner in = new Scanner(System.in);
    public static Leon leon;
    public static Pinguino pinguino;

    public static void main(String[] args) {
        // crear leon y pinguino
        leon = pedirDatosLeon();
        pinguino = pedirDatosPinguino();

        // agregando cuidadores y visitantes respectivamente
        agregarCuidadoresLeones();
        // agregarCuidadoresPinguinos();
        agregarVisitanteLeones();
        // agregarVisitantePinguinos();

        // metodos de pinguinos y leones

        leon.comer();
        leon.dormir();
        leon.cazar();
        leon.rugir();

        pinguino.comer();
        pinguino.dormir();
        pinguino.pescar();
        pinguino.nadar();

    }

    public static Pinguino pedirDatosPinguino() {
        String nombre, numeroRegistro;
        int edad;

        System.out.println("-Nombre: ");
        nombre = pedirString();
        System.out.println("Edad: ");
        edad = pedirEntero();
        System.out.println("Numero registro: ");
        numeroRegistro = pedirString();

        return new Pinguino(nombre, edad, numeroRegistro);
    }

    public static Leon pedirDatosLeon() {
        String nombre, numeroRegistro;
        int edad;
        boolean tieneVacuna;

        System.out.println("-Nombre: ");
        nombre = pedirString();
        System.out.println("Edad: ");
        edad = pedirEntero();
        System.out.println("Numero registro: ");
        numeroRegistro = pedirString();
        System.out.println("Tiene vacuna?: ");
        tieneVacuna = pedirBoolean();

        return new Leon(nombre, edad, numeroRegistro, tieneVacuna);
    }

    // Métodos para pedir datos con manejo de excepciones
    public static String pedirString() {
        String input;
        while (true) {
            try {
                input = in.next();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingresa una cadena de texto válida.");
                in.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }

    public static int pedirEntero() {
        int input;
        while (true) {
            try {
                input = in.nextInt();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingresa un número entero válido.");
                in.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }

    public static boolean pedirBoolean() {
        boolean input;
        while (true) {
            try {
                input = in.nextBoolean();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingresa un valor booleano válido.");
                in.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }

    public static void agregarVisitanteLeones() {
        String nombre, cedula, numeroCarnet;
        int edad;

        System.out.println("Nombre: ");
        nombre = pedirString();
        System.out.println("Edad: ");
        edad = pedirEntero();
        System.out.println("Cedula: ");
        cedula = pedirString();
        System.out.println("Numero de Carnet: ");
        numeroCarnet = pedirString();

        leon.visitantes.add(new Visitante(nombre, edad, cedula, numeroCarnet));
    }

    public static void listarVisitantesLeones() {

        System.out.println("\n*.**..**.LISTANDO VISITANTES DE LOS LEONES *..****.*.*.*.*.\n");
        for (Visitante v : leon.visitantes) {
            System.out.println("Nombre" + v.nombre);
            System.out.println("Edad: " + v.edad);
            System.out.println("Cedula: " + v.getCedula());
            System.out.println("NumeroCarnet: " + v.numeroCarnet);

        }

        System.out.println("\n*.**..**..*.*.*..*****.*.*..****.*.*.*.*.\n");

    }

    public static void agregarCuidadoresLeones() {
        String nombre, cedula, numeroID;
        int edad;

        System.out.println("Nombre: ");
        nombre = pedirString();
        System.out.println("Edad: ");
        edad = pedirEntero();
        System.out.println("Cedula: ");
        cedula = pedirString();
        System.out.println("Numero de Carnet: ");
        numeroID = pedirString();

        leon.cuidadores.add(new Cuidador(nombre, edad, cedula, numeroID));
    }

    public static void listarCuidadoresLeones() {
        System.out.println("\n*.**..**.LISTANDO CUIDADORES DE LOS LEONES *..****.*.*.*.*.\n");
        for (Cuidador c : leon.cuidadores) {
            System.out.println("Nombre" + c.nombre);
            System.out.println("Edad: " + c.edad);
            System.out.println("Cedula: " + c.getCedula());
            System.out.println("NumeroID: " + c.numeroID);

        }

        System.out.println("\n*.**..**..*.*.*..*****.*.*..****.*.*.*.*.\n");

    }

    public static void agregarVisitantePinguinos() {
        String nombre, cedula, numeroCarnet;
        int edad;

        System.out.println("Nombre: ");
        nombre = pedirString();
        System.out.println("Edad: ");
        edad = pedirEntero();
        System.out.println("Cedula: ");
        cedula = pedirString();
        System.out.println("Numero de Carnet: ");
        numeroCarnet = pedirString();

        pinguino.visitantes.add(new Visitante(nombre, edad, cedula, numeroCarnet));
    }

    public static void listarVisitantesPinguinos() {

        System.out.println("\n*.**..**.LISTANDO VISITANTES DE LOS PINGUINOS *..****.*.*.*.*.\n");
        for (Visitante v : pinguino.visitantes) {
            System.out.println("Nombre" + v.nombre);
            System.out.println("Edad: " + v.edad);
            System.out.println("Cedula: " + v.getCedula());
            System.out.println("NumeroCarnet: " + v.numeroCarnet);

        }

        System.out.println("\n*.**..**..*.*.*..*****.*.*..****.*.*.*.*.\n");

    }

    public static void agregarCuidadoresPinguinos() {
        String nombre, cedula, numeroID;
        int edad;

        System.out.println("Nombre: ");
        nombre = pedirString();
        System.out.println("Edad: ");
        edad = pedirEntero();
        System.out.println("Cedula: ");
        cedula = pedirString();
        System.out.println("Numero de Carnet: ");
        numeroID = pedirString();

        pinguino.cuidadores.add(new Cuidador(nombre, edad, cedula, numeroID));
    }

    public static void listarCuidadoresPinguinos() {
        System.out.println("\n*.**..**.LISTANDO CUIDADORES DE LOS PINGUINOS *..****.*.*.*.*.\n");
        for (Cuidador c : pinguino.cuidadores) {
            System.out.println("Nombre" + c.nombre);
            System.out.println("Edad: " + c.edad);
            System.out.println("Cedula: " + c.getCedula());
            System.out.println("NumeroID: " + c.numeroID);

        }

        System.out.println("\n*.**..**..*.*.*..*****.*.*..****.*.*.*.*.\n");

    }

}
