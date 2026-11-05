
public class Main {
    public static void main(String[] args) {

        Punto punto1 = new Punto();

        Punto punto2 = new Punto(3, 4);

        System.out.println("PUNTO 1");
        punto1.mostrarCoordenadas();

        System.out.println("\nPUNTO 2");
        punto2.mostrarCoordenadas();

        System.out.println("\nCoordenada X: " + punto2.getX());
        System.out.println("Coordenada Y: " + punto2.getY());

        punto2.setX(6);
        punto2.setY(8);

        System.out.println("\nDespués de modificar:");
        punto2.mostrarCoordenadas();

        punto2.mover(2, 3);

        System.out.println("\nDespués de mover:");
        punto2.mostrarCoordenadas();

        System.out.println("\nDistancia desde el origen: "
                + punto2.calcularDistanciaDesdeOrigen());
    }
}
