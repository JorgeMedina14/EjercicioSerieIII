public class Canela extends Decorator{
    public Canela(Bebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    public double calcularCostoTotal() {
        return bebidaBase.calcularCostoTotal() + 0.3;
    }

    @Override
    public String getDescripcion() {
        return bebidaBase.getDescripcion() + ", Canela";
    }
}
