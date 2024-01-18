package ejercicio3;

public class Pinguino extends Zoo {

    @Override
    public void dormir() {
        System.out.println("\n" + //
                "Los pingüinos en zoológicos descansan durante la noche y duermen en lugares protegidos, generalmente agrupados para conservar calor\n"
                + //
                "\n");
    }

    @Override
    public void comer() {
        System.out.println("\nLos pingüinos en zoológicos comen principalmente pescado y otros alimentos marinos.\n" + //

                "\n");
    }

    public void nadar() {
        System.out.println("\n***************************************************\n");
        System.out.println("NADANDO Y ENTRENANDO !!! ^W^");
        System.out.println("\n***************************************************\n");

    }

    public void pescar() {
        System.out.println("\n***************************************************\n");
        System.out.println("NADANDO POR LA COMIDA! PESCADO A LA VISTA!!! ^W^");
        System.out.println("\n***************************************************\n");

    }

    @Override
    public String toString() {

        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Numero Registro: " + getNumeroRegistro() + "\n";

    }

    public Pinguino() {

    }

    public Pinguino(String nombre, int edad, String numeroRegistro) {
        super(nombre, edad, numeroRegistro);
    }
}
