public class Carro {
    String marca;
    String  modelo;
    int ano;


    public Carro(String marca, String modelo, int ano ){
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;


    }

    public String getMarca(){
        return marca;
    }
    public int getAno(){
        return ano;
    }
    public String getModelo(){
        return modelo;
    }

    public void Exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}




