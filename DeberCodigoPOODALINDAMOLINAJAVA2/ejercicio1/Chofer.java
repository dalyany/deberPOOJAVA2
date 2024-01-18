package ejercicio1;

public class Chofer extends Persona {

    // atributos
    public String numeroPlaca;
    public String codigoTaxi;

    // metodos
    public void aceptarCarrera() {

        System.out.println("\nCONFIRMAR CLIENTE - USUARIO - DESTINO ");
        System.out.println("CONFIRMAR PAGO $$ ****\n");

    }

    public void cancelarCarrera() {
        System.out.println("\nCANCELANDO SERVICIO! ");
        System.out.println("VALIDANDO O RESPONDER RAZON DE CANCELACIÓN :( *************\n)");

    }

    @Override
    public void accion() {

        cancelarCarrera();
        aceptarCarrera();

        System.out.println("MI INFORMAICION ES: ");
        decirInformacionPersonal();
        System.out.println("EL NUMERO DE PLACA DEL TAXI ES: " + this.numeroPlaca);
        System.out.println("El codigo del taxi es :" + this.codigoTaxi);

    }

    // constructores
    public Chofer() {
        this.numeroPlaca = "";
        this.codigoTaxi = "";
    }

    public Chofer(String nombre, int edad, String cedula, String numeroPlaca, String codigoTaxi) {
        super(nombre, edad, cedula);
        this.numeroPlaca = numeroPlaca;
        this.codigoTaxi = codigoTaxi;
    }
}
