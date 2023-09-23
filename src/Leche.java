public class Leche extends Decorator{
    public Leche(Bebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    public double calcularCostoTotal() {
        return  bebidaBase.calcularCostoTotal() + 1.0;
    }

    @Override
    public String getDescripcion() {
        return bebidaBase.getDescripcion()+", Leche";
    }
}
