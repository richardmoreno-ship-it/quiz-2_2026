
public class Punto {

    private double x;
    private double y;

    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double nuevoX) {
        this.x = nuevoX;
    }

    public void setY(double nuevoY) {
        this.y = nuevoY;
    }

    public void mover(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public double calcularDistanciaDesdeOrigen() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public void mostrarCoordenadas() {
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }
}
