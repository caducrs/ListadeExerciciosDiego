public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro("Honda", "Civic", 2022);
        Carro c2 = new Carro();

        c1.exibir();
        System.out.println();
        c2.exibir();

        Carro.imprimirTotal();

    }
}