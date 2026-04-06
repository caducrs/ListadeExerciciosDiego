public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Alice", "alice@email.com", "1234-5678");
        Cliente c2 = new Cliente("Bruno", "bruno@email.com");
        Cliente c3 = new Cliente("Carlos");

        System.out.println("Cliente 1:");
        c1.exibir();
        System.out.println("\nCliente 2:");
        c2.exibir();
        System.out.println("\nCliente 3:");
        c3.exibir();

         System.out.println("\nTotal de clientes: " + Cliente.totalClientes);
    }
}