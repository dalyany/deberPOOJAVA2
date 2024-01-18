package ejercicio2;

public abstract class Animal {

    public String nombre;
    private int edad;

    public Animal() {
        this.nombre = "";
        this.edad = 0;
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract String hacerSonido();

}
