
public class Main {

    public static void main(String[] args) {

        
        CuentaBancaria cuenta1 = new CuentaBancaria(
                "123456789",
                "Richard Moreno");

       
        cuenta1.mostrarInformacion();

  
        cuenta1.depositar(500000);
        cuenta1.depositar(200000);

     
        cuenta1.retirar(150000);

       
        cuenta1.retirar(1000000);

        cuenta1.mostrarInformacion();

        
        CuentaBancaria cuenta2 = new CuentaBancaria(
                "987654321",
                "Carlos Perez",
                1000000);

        cuenta2.mostrarInformacion();
    }
}
