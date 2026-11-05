
public class Apartamento {

    private int numero;
    private int numeroHabitaciones;

    Apartamento(int numero, int numeroHabitaciones) {
        this.numero = numero;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void mostrarInformacion() {
        System.out.println("Apartamento: " + numero);
        System.out.println("Numero de habitaciones: " + numeroHabitaciones);
        System.out.println("---------------------------");
    }
}
