package ejercicio3;

public class Leon extends Zoo {

    public boolean tieneVacuna;

    public Leon() {
        this.tieneVacuna = false;
    }

    public Leon(String nombre, int edad, String numeroRegistro, boolean tieneVacuna) {
        super(nombre, edad, numeroRegistro);
        this.tieneVacuna = tieneVacuna;
    }

    public void rugir() {
        System.out.println("\n**.*..*..*.RAUUUWWWWWW!!! **.**.*.**..*..*.\n");
    }

    public void cazar() {

        System.out.println("\n**.*..*..* CAZANDO CARNE , ANTILOPES Y PRESAS!!!!  **.**.*.**..*..*.\n");

    }

    @Override
    public void dormir() {
        System.out.println(
                "Los leones en lugares ambientados tipo sabana ,en los  zoológicos duermen principalmente durante el día en lugares cómodos.\n"); //

    }

    @Override
    public void comer() {
        System.out.println(
                "Leones en zoológicos , su dieta principalmente esta dada por carne y proteinas similares .\n");
    }

    @Override
    public String toString() {

        String tieneVacuna = this.tieneVacuna ? "SI TIENE" : "NO TIENE";
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Numero Registro: " + getNumeroRegistro() + "\n" +
                "Tiene Vacuna?: " + tieneVacuna;
    }

}
