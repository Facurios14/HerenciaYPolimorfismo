public class SistemaDePagos {
    public static void main(String[] args) {
        // Crear objetos de métodos de pago
        MetodoPago tarjeta1 = new TarjetaCredito("Juan Perez", "1234567890123456", "12/25", "123");
        MetodoPago paypal1 = new PayPal("Maria Lopez", "7890", "maria@gmail.com");

        // Crear objeto de pagos
        Pagos pagos = new Pagos();

        // Agregar métodos de pago
        pagos.agregarMetodoPago(tarjeta1);
        pagos.agregarMetodoPago(paypal1);

        // Mostrar la información de todos los métodos de pago
        System.out.println("Información de los métodos de pago:");
        pagos.mostrarInformacionPagos();

        // Realizar los pagos
        System.out.println("\nRealizando pagos...");
        pagos.realizarPagos();

        // Cancelar los pagos
        System.out.println("\nCancelando pagos...");
        pagos.cancelarPagos();
    }
}
