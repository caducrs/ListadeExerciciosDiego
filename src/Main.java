public class Main {

    public static void main(String[] args) {
        int x; // declarada aqui, no escopo do metodo

        if (true) {
            x = 10; // inicializa dentro do if
        }

        System.out.println(x); // agora funciona
    }
}