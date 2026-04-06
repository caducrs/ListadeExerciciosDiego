public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // construtor parametrizado ai o
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); // reaproveita a validação
    }

    // Construtor vazio (sobrecarga)
    public Carro() {
        this("Desconhecido", "Desconhecido", 0);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        int anoAtual = java.time.Year.now().getValue();

        if (ano < 1886 || ano > anoAtual) {
            System.out.println("Ano Inválido! Deve estar entre 1886 e " + anoAtual);
        } else {
            this.ano = ano;
        }
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public int idadeDoCarro() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - ano;
    }
}