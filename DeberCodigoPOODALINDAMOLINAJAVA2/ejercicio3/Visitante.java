package ejercicio3;

public class Visitante extends Persona {
    public String numeroCarnet;

    @Override
    public void dormir() {
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*..\n");
        System.out.println("MIMICION EN CASITA :3 \n");
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*..\n");
    }

    public void comprar() {

        System.out.println("\n.......**.**..**..*.   comprar subenires .*....*...*.\n");
    }

    @Override
    public void comer() {

        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*..\n");
        System.out.println("COMIDA , PLATOS FUERTES Y GASTRONOMIA DEL SECTOR ");
        System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*..*.**.*.*.*.*.*..\n");
    }

    public Visitante() {
        this.numeroCarnet = "";
    }

    public Visitante(String nombre, int edad, String cedula, String numeroCarnet) {
        super(nombre, edad, cedula);
        this.numeroCarnet = numeroCarnet;
    }

}
