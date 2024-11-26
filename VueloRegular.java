public class VueloRegular extends Vuelo implements Promocionable {
    int numeroAsientos;
    double precioPorAsiento;

    // Constructor
    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioPorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioPorAsiento = precioPorAsiento;
    }

    // Implementación del método calcularPrecio
    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioPorAsiento;
    }

    // Implementación del método aplicarPromocion
    @Override
    public void aplicarPromocion() {
        // Aplicar un 10% de descuento en el precio total del vuelo regular
        double precioConDescuento = calcularPrecio() * 0.9;
        System.out.println("El precio con promoción del vuelo regular es: $" + precioConDescuento);
    }
}

