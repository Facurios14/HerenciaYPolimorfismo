public class PayPal extends MetodoPago implements Cancelable {
    String correoElectronico;

    // Constructor
    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    // Implementación del método realizarPago
    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con PayPal...");
        System.out.println("Pago realizado con éxito desde la cuenta de correo " + correoElectronico);
    }

    // Implementación del método cancelarPago
    @Override
    public void cancelarPago() {
        System.out.println("Pago con PayPal cancelado.");
    }
}
