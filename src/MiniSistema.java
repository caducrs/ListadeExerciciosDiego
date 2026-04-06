import java.util.ArrayList;
import java.util.Scanner;

public class MiniSistema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> listaCarros = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Cadastrar Carro");
            System.out.println("2) Listar todos os carros");
            System.out.println("3) Total cadastrado");
            System.out.println("4) Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        sc.close();
    }
}