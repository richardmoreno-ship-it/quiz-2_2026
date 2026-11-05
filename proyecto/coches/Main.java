
public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Toyota", "Corolla", 2022);

        coche1.mostrarEstado();

        coche1.acelerar(30);

        coche1.encenderMotor();

        coche1.acelerar(30);
        coche1.acelerar(20);

        coche1.frenar(15);

        coche1.apagarMotor();

        coche1.frenar(35);

        coche1.apagarMotor();

        coche1.mostrarEstado();

        Coche coche2 = new Coche("Chevrolet", "Spark");

        coche2.mostrarEstado();
    }
}
