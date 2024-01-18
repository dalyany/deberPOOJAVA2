package ejercicio3;

import java.util.ArrayList;

public abstract class Zoo {

    private String numeroRegistro;
    public String nombre;
    public int edad;
    public ArrayList<Visitante> visitantes;
    public ArrayList<Cuidador> cuidadores;

    public Zoo() {
        this.nombre = "";
        this.edad = 0;
        this.numeroRegistro = "";

        this.visitantes = new ArrayList<Visitante>();
        this.cuidadores = new ArrayList<Cuidador>();
    }

    public Zoo(String nombre, int edad, String numeroRegistro) {
        this.nombre = nombre;
        this.edad = edad;

        this.numeroRegistro = numeroRegistro;
        this.visitantes = new ArrayList<Visitante>();
        this.cuidadores = new ArrayList<Cuidador>();
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public abstract void dormir();

    public abstract void comer();

}
