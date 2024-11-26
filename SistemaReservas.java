public class SistemaReservas {
    public static void main(String[] args) {
        // Crear vuelos regulares y vuelos charter
        VueloRegular vueloRegular1 = new VueloRegular("V001", "Buenos Aires", "Madrid", "2024-12-01", 150, 1200);
        VueloCharter vueloCharter1 = new VueloCharter("C001", "Miami", "Cancún", "2024-12-10", 5000);

        // Crear objeto de reservas
        Reservas reservas = new Reservas();

        // Agregar vuelos a las reservas
        reservas.agregarVuelo(vueloRegular1);
        reservas.agregarVuelo(vueloCharter1);

        // Mostrar la información de todos los vuelos
        System.out.println("Información de los vuelos:");
        reservas.mostrarInformacionVuelos();

        // Calcular y mostrar el precio total de las reservas
        double precioTotal = reservas.calcularPrecioTotal();
        System.out.println("El precio total de todas las reservas es: $" + precioTotal);

        // Aplicar promociones a los vuelos
        System.out.println("\nAplicando promociones...");
        reservas.aplicarPromociones();
    }
}

