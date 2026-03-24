public class Main{

    public static void main(String[] Args){
        Carro meuCarro = new Carro("Mercedes","Amg",2000);
        Carro nossoCarro = new Carro("Toyota","Etios",2020);

        System.out.println("Carro1: " + meuCarro.marca + " " + meuCarro.modelo + " " + meuCarro.ano);
        System.out.println("Carro2: " + nossoCarro.marca + " " + nossoCarro.modelo + " " + nossoCarro.ano);
    }
}