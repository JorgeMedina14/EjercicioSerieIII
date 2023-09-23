public class Te extends Bebida{
    public Te() {
        descripcion = "Té";
        costo = 1.5;
    }
    @Override
    public double calcularCostoTotal() {
        return costo;
    }
}
