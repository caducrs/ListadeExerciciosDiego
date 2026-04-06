public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro("Honda", "Civic", 2022);

        Carro c2 = new Carro();

        System.out.println("Dados do carro:");
        c1.exibir();

        System.out.println("\nCarro 2:");
        c2.exibir();

        // Diferença:
        // O construtor com parâmetros cria o objeto já com valores definidos.
        // O construtor vazio cria o objeto com valores padrão ("Desconhecido" e 0),
        // sendo necessário alterar depois se quiser valores reais.
    }
}