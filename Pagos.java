import java.util.ArrayList;

public class Pagos {
    ArrayList<MetodoPago> metodosPago;

    public Pagos() {
        metodosPago = new ArrayList<>();
    }

    // Método para agregar métodos de pago
    public void agregarMetodoPago(MetodoPago metodo) {
        metodosPago.add(metodo);
    }

    // Método para realizar los pagos
    public void realizarPagos() {
        for (MetodoPago metodo : metodosPago) {
            metodo.realizarPago();
        }
    }

    // Método para cancelar los pagos
    public void cancelarPagos() {
        for (MetodoPago metodo : metodosPago) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            }
        }
    }

    // Método para mostrar la información de todos los métodos de pago
    public void mostrarInformacionPagos() {
        for (MetodoPago metodo : metodosPago) {
            System.out.println("Método de pago: " + metodo.getClass().getSimpleName());
            System.out.println("Titular: " + metodo.titular);
            System.out.println("Número: " + metodo.numero);
            System.out.println("---------------------------");
        }
    }
}
