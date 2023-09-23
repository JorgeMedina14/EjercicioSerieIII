abstract class Bebida {
    protected String descripcion;
    protected double costo;

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double calcularCostoTotal();
}

