public class Chocolate extends Decorator{
    public Chocolate(Bebida bebidaBase) {
        super(bebidaBase);
    }

    @Override
    public double calcularCostoTotal() {
        return  bebidaBase.calcularCostoTotal() + 0.5;
    }

    @Override
    public String getDescripcion() {
        return bebidaBase.getDescripcion() + ", Chocolate";
    }
}
