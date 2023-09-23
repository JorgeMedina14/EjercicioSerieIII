abstract class Decorator extends Bebida{
    protected Bebida bebidaBase;

    public Decorator(Bebida bebidaBase) {
        this.bebidaBase = bebidaBase;
    }

    public abstract String getDescripcion();
}
