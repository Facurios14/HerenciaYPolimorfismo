public class VueloCharter extends Vuelo implements Promocionable {
    double precioTotal;

    // Constructor
    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    // Implementación del método calcularPrecio
    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    // Implementación del método aplicarPromocion
    @Override
    public void aplicarPromocion() {
        // Aplicar un 15% de descuento en el precio total del vuelo charter
        double precioConDescuento = calcularPrecio() * 0.85;
        System.out.println("El precio con promoción del vuelo charter es: $" + precioConDescuento);
    }
}
