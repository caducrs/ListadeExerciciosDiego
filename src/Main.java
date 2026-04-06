import java.util.ArrayList;

public class Main{

    public static void main(String[] Args){

        Carro c1 = new Carro();
        c1.setMarca("Toyota");
        c1.setModelo("Corolla");
        c1.setAno(2023);

        System.out.println("Dados do carro:");
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ano: " + c1.getAno());

    }


}