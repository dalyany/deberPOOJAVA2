package ejercicio2;

public class Gato extends Animal {

    public Gato() {
        this.colorPelo = "";
    }

    public Gato(String nombre, int edad, String colorPelo) {
        super(nombre, edad);
        this.colorPelo = colorPelo;
    }

    public String colorPelo;

    @Override
    public String hacerSonido() {
        return "\nMIAUUU!! ^u^\n";
    }

    public void treparArbol() {

        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.**.*.**.*.*.*.\n");
        System.out.println("TREPANDO ARBOL PARA JUGAR Y ATRAPAR AVE!!! ^u^");
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.**.*.**.*.*.*.\n");

    }

    public void cazarRaton() {

        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.**.*.**.*.*.*.\n");
        System.out.println("CAZANDO RATON , ATRAPANDO LA PRESA! !!! ^u^");
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.**.*.**.*.*.*.\n");
    }

    @Override
    public String toString() {

        return "NOMBRE: " + this.nombre + "\n" +
                "EDAD: " + getEdad() + "\n" +
                "COLOR PELO: " + colorPelo + "\n";
    }

}
