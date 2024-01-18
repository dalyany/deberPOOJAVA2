package ejercicio3;

public abstract class Persona {
    public String nombre;
    public int edad;
    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.cedula = "";
    }

    public Persona(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public abstract void dormir();

    public abstract void comer();

}
