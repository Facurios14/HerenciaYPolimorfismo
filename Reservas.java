import java.util.ArrayList;

public class Reservas {
    ArrayList<Vuelo> vuelos;

    public Reservas() {
        vuelos = new ArrayList<>();
    }

    // Método para agregar vuelos
    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    // Método para calcular el precio total de todas las reservas
    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Vuelo vuelo : vuelos) {
            precioTotal += vuelo.calcularPrecio();
        }
        return precioTotal;
    }

    // Método para aplicar promociones a vuelos promocionables
    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    // Método para mostrar la información de todos los vuelos
    public void mostrarInformacionVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println("Número de vuelo: " + vuelo.numeroVuelo);
            System.out.println("Origen: " + vuelo.origen);
            System.out.println("Destino: " + vuelo.destino);
            System.out.println("Fecha: " + vuelo.fecha);
            System.out.println("Precio: $" + vuelo.calcularPrecio());
            System.out.println("----------------------");
        }
    }
}

