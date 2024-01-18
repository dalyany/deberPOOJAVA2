package ejercicio1;

public class Pasajero extends Persona {
    // atributos

    public String numeroID;

    // metodos

    public void pedirTaxi() {

        System.out.println("\n************** PEDIR TAXI *****************\n");
        System.out.println("Esoger aplicacion para taxi: ");
        System.out.println("Ingresar el destino +++ ");
        System.out.println("Verficar ubicacion de origen ");
        System.out.println("Confirmar pedido! :) ");

        System.out.println("\n*********************************+\n");

    }

    public void cancelarTaxi() {
        System.out.println("\n************ CANCELANDO VIAJE *************\n");
        System.out.println("Seleccionamos la carrera !");
        System.out.println("Cancelamos el viaje ");
        System.out.println("Explicar la razón por cual se cancela el viaje :  ");
        System.out.println("Confirmar cancelacion ! :(   )");
        System.out.println("\n************************\n");

    }

    @Override
    public void accion() {

        pedirTaxi();
        cancelarTaxi();

        System.out.println("MI INFORMAICION ES: ");
        decirInformacionPersonal();
        System.out.println("MI ID: " + this.numeroID);

    }
    // constructores

    public Pasajero() {

        this.numeroID = "";

    }

    public Pasajero(String nombre, int edad, String cedula, String numeroID) {
        super(nombre, edad, cedula);
        this.numeroID = numeroID;
    }

}
