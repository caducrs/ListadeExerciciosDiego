public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = a; // b recebe uma cópia do valor de a
        b = 99;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // alterar b nao afeta a porque sao dois espaços de memoria diferente
    }
}