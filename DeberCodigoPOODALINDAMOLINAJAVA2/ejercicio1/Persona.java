package ejercicio1;

public abstract class Persona {

    // ! una clase abstracta es aquella que tiene por lo menos 1 metodo abstracto, y
    // no tiene o no se puede crear instancias de esta

    // atributos
    public String nombre;
    public int edad;
    private String cedula;

    // metodos

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void decirInformacionPersonal() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cedula: " + cedula);
    }

    public abstract void accion();

    // constructores
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

}