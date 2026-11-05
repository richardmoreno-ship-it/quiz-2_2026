
import java.util.ArrayList;

public class Edificio {

    private String direccion;
    private int totalApartamentos;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String direccion, int totalApartamentos) {
        this.direccion = direccion;
        this.totalApartamentos = totalApartamentos;
        this.apartamentos = new ArrayList<>();

        if (totalApartamentos <= 0) {
            throw new IllegalArgumentException(
                    "El total de apartamentos debe ser positivo.");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTotalApartamentos() {
        return totalApartamentos;
    }

    public int getCantidadApartamentos() {
        return apartamentos.size();
    }

    public void agregarApartamento(int numero, int habitaciones) {

        if (apartamentos.size() >= totalApartamentos) {
            System.out.println("Error: el edificio esta lleno.");
            return;
        }

        if (numero <= 0 || habitaciones <= 0) {
            System.out.println("Error: datos del apartamento invalidos.");
            return;
        }

        if (buscarApartamento(numero) != null) {
            System.out.println("Error: el apartamento ya existe.");
            return;
        }

        Apartamento nuevo = new Apartamento(numero, habitaciones);

        apartamentos.add(nuevo);

        System.out.println("Apartamento " + numero + " agregado correctamente.");
    }

    public Apartamento buscarApartamento(int numero) {

        for (Apartamento apartamento : apartamentos) {

            if (apartamento.getNumero() == numero) {
                return apartamento;
            }
        }

        return null;
    }

    public void mostrarApartamentos() {

        System.out.println("\n===== INFORMACION DEL EDIFICIO =====");
        System.out.println("Direccion: " + direccion);
        System.out.println("Capacidad total: " + totalApartamentos);
        System.out.println("Apartamentos registrados: " + apartamentos.size());

        if (apartamentos.isEmpty()) {
            System.out.println("No hay apartamentos registrados.");
        } else {

            for (Apartamento apartamento : apartamentos) {
                apartamento.mostrarInformacion();
            }
        }
    }
}
