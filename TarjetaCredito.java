public class TarjetaCredito extends MetodoPago implements Cancelable {
    String fechaExpiracion;
    String codigoSeguridad;

    // Constructor
    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    // Implementación del método realizarPago
    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con tarjeta de crédito...");
        System.out.println("Pago realizado con éxito a nombre de " + titular);
    }

    // Implementación del método cancelarPago
    @Override
    public void cancelarPago() {
        System.out.println("Pago con tarjeta de crédito cancelado.");
    }
}
