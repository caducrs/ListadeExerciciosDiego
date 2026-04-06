public class Main {

    public static void main(String[] args) {
        Carro c1 = new Carro("Fiat", "Uno", 2020);
        Carro c2 = c1;  // c2 recebe a referência de c1
        c2.setModelo("Palio");

        System.out.println(c1.getModelo());
        System.out.println(c2.getModelo());

        // c1 e c2 apontam para o mesmo carro na memória.
        // Alterar o modelo por c2 também muda c1, porque ambos compartilham o mesmo objeto.
    }
}