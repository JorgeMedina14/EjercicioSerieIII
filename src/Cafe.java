public class Cafe extends Bebida{

    public Cafe() {
        descripcion = "Café";
        costo = 5.0;
    }
    @Override
    public double calcularCostoTotal() {
        return costo;
    }
}
