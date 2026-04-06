public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("VW", "Gol", 2015);
        trocarModelo(meuCarro);
        System.out.println(meuCarro.getModelo());
    }

    public static void trocarModelo(Carro c) {
        c.setModelo("Fusca");
    }

    // O parametro c aponta para o mesmo objeto que meuCarro.
    // Qualquer alteração feita por c afeta o objeto original.
}