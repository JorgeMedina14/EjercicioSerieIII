public class Main {
    public static void main(String[] args) {
        Bebida cafeBase = new Cafe();
        Bebida cafeConLeche = new Leche(cafeBase);
        Bebida cafeConLecheYChocolate = new Chocolate(cafeConLeche);

        System.out.println("Descripción de la bebida personalizada: " + cafeConLecheYChocolate.getDescripcion());
        System.out.println("Costo total de la bebida personalizada: Q" + cafeConLecheYChocolate.calcularCostoTotal());
}
}