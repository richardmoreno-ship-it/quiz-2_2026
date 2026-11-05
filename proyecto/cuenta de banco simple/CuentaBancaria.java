
public class CuentaBancaria {

    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String nombreTitular) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = 0.0;
    }

    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
            System.out.println("El saldo inicial no puede ser negativo.");
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso: $" + monto);
        } else {
            System.out.println("Error: el monto debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto debe ser positivo.");
        } else if (monto > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso: $" + monto);
        }
    }

    public void mostrarInformacion() {
        System.out.println("\n--- INFORMACION DE LA CUENTA ---");
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Nombre del titular: " + nombreTitular);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("--------------------------------");
    }
}
