package ejercicio3;

public class Cuidador extends Persona {

    public String numeroID;

    public void alimentarAnimales() {

        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*.*.*\n");
        System.out.println("ALIMENTANDO LOS ANIMALES SIGUIENDO NORMAS DEL ZOO ^W^");
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*..\n");

    }

    @Override
    public void dormir() {
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*..\n");
        System.out.println("DURMIENDO EN EL RESINTO DEL ZOO, CUARTO ESPECIAL ");
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*..\n");
    }

    @Override
    public void comer() {
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*..\n");
        System.out.println("COMIDA DEL SANTUARIO DEL ZOO , FINANCIADO POR GOBIERNO Y VISITANTES ");
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*..\n");
    }

    public Cuidador() {
        this.numeroID = "";
    }

    public Cuidador(String nombre, int edad, String cedula, String numeroID) {
        super(nombre, edad, cedula);
        this.numeroID = numeroID;
    }

}
