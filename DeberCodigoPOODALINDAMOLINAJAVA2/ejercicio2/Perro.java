package ejercicio2;

public class Perro extends Animal {

    public String raza;

    public Perro() {
        this.raza = "";
    }

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public String hacerSonido() {
        return "\nGUAU! O_O\n";
    }

    public void correr() {
        System.out.println("\n*.*.*..*.**.*.*.*.*..*.*.*.**.*.*.**.**\n");
        System.out.println("CORRIENDO CON SU AMO, PERSIGUIENDO A UNA PALOMA !! ^o^");
        System.out.println("\n*.*.*..*.**.*.*.*.*..*.*.*.**.*.*.**.**\n");

    }

    public void jugar() {
        System.out.println("\n*.*.*..*.**.*.*.*.*..*.*.*.**.*.*.**.**\n");
        System.out.println("JUGANDO CON SU AMO, JUGANDO A REGRESARLE LA PELOTA!! ^o^");
        System.out.println("\n*.*.*..*.**.*.*.*.*..*.*.*.**.*.*.**.**\n");

    }

    @Override
    public String toString() {

        return "NOMBRE: " + this.nombre + "\n" +
                "EDAD: " + getEdad() + "\n" +
                "RAZA: " + raza + "\n";
    }

}
