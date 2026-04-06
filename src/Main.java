public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro("Honda", "Civic", 2022);
        Carro c2 = new Carro();
        Carro c3 = new Carro("Toyota", "Corolla", 2021);
        Carro c4 = new Carro();
        Carro c5 = new Carro("Ford", "Mustang", 2023);

        c1.exibir();
        System.out.println();
        c2.exibir();

        // Usando o metodo static
        Carro.imprimirTotal();
    }
}