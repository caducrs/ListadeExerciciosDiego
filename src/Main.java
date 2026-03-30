import java.util.ArrayList;

public class Main{

    public static void main(String[] Args){

        ArrayList<Carro> listaCarro = new ArrayList<>();

        Carro meuCarro = new Carro("Mercedes","Amg",2000);
        listaCarro.add(meuCarro);

        Carro nossoCarro = new Carro("Toyota","Etios",2020);
        listaCarro.add(nossoCarro);

        Carro vossosCarros = new Carro("Geely","X69",2026);
        listaCarro.add(vossosCarros);


        for(Carro c : listaCarro){
            c.Exibir();
        }

//        System.out.println("Carro1: " + meuCarro.marca + " " + meuCarro.modelo + " " + meuCarro.ano);
//        System.out.println("Carro2: " + nossoCarro.marca + " " + nossoCarro.modelo + " " + nossoCarro.ano);


//        meuCarro.Exibir(); // esse metodo retorna valor
//
//        int idade = meuCarro.idadeDoCarro(); // esse metodo executa uma ação
//        System.out.println("idade do carro: " + idade);

    }


}