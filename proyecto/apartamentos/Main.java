
public class Main {

    public static void main(String[] args) {

        Edificio edificio = new Edificio(
                "Calle 45 # 20-15, Bogota",
                4);

        edificio.agregarApartamento(101, 3);
        edificio.agregarApartamento(102, 2);
        edificio.agregarApartamento(103, 4);
        edificio.agregarApartamento(104, 3);

        edificio.agregarApartamento(105, 2);

        edificio.mostrarApartamentos();

        System.out.println("\n===== BUSCAR APARTAMENTO =====");

        Apartamento encontrado = edificio.buscarApartamento(102);

        if (encontrado != null) {
            System.out.println("Apartamento encontrado:");
            encontrado.mostrarInformacion();
        } else {
            System.out.println("Apartamento no encontrado.");
        }
    }
}
