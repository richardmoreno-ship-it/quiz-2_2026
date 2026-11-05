
public class Coche {

    private String marca;
    private String modelo;
    private int añoFabricacion;
    private double velocidadActual;
    private boolean motorEncendido;

    public Coche(String marca, String modelo, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.velocidadActual = 0.0;
        this.motorEncendido = false;
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = 2025;
        this.velocidadActual = 0.0;
        this.motorEncendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void encenderMotor() {
        if (!motorEncendido) {
            motorEncendido = true;
            System.out.println("Motor encendido correctamente.");
        } else {
            System.out.println("El motor ya esta encendido.");
        }
    }

    public void apagarMotor() {
        if (motorEncendido && velocidadActual == 0) {
            motorEncendido = false;
            System.out.println("Motor apagado correctamente.");
        } else if (!motorEncendido) {
            System.out.println("El motor ya esta apagado.");
        } else {
            System.out.println("No se puede apagar el motor mientras el coche esta en movimiento.");
        }
    }

    public void acelerar(double incremento) {
        if (!motorEncendido) {
            System.out.println("No se puede acelerar: el motor esta apagado.");
        } else if (incremento <= 0) {
            System.out.println("El incremento debe ser positivo.");
        } else {
            velocidadActual += incremento;
            System.out.println("Acelerando... Velocidad actual: " + velocidadActual + " km/h");
        }
    }

    public void frenar(double decremento) {
        if (!motorEncendido) {
            System.out.println("No se puede frenar: el motor esta apagado.");
        } else if (decremento <= 0) {
            System.out.println("El decremento debe ser positivo.");
        } else if (decremento > velocidadActual) {
            System.out.println("El decremento supera la velocidad actual.");
        } else {
            velocidadActual -= decremento;
            System.out.println("Frenando... Velocidad actual: " + velocidadActual + " km/h");
        }
    }

    public void mostrarEstado() {
        System.out.println("\n===== ESTADO DEL COCHE =====");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricacion: " + añoFabricacion);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Motor encendido: " + (motorEncendido ? "Si" : "No"));
        System.out.println("============================");
    }
}
