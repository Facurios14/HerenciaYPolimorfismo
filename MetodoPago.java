public abstract class MetodoPago {
    String titular;
    String numero;

    // Constructor
    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    // Método abstracto para realizar el pago
    public abstract void realizarPago();
}
