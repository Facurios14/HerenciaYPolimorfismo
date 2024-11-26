
public abstract class Vuelo {
    String numeroVuelo;
    String origen;
    String destino;
    String fecha; // Fecha representada como String

    // Constructor
    public Vuelo(String numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    // Método abstracto para calcular el precio
    public abstract double calcularPrecio();
}

