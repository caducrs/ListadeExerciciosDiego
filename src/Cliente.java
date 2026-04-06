public class Cliente {
    private String nome;
    private String email;
    private String telefone;

    // Atributo de classe
    public static int totalClientes = 0;

    // Construtor 1: todos os dados
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalClientes++;
    }

    // Construtor 2: nome e email, telefone padrão
    public Cliente(String nome, String email) {
        this(nome, email, "Não informado"); // chama o construtor completo
    }

    // Construtor 3: só nome, email e telefone padrão
    public Cliente(String nome) {
        this(nome, "Não informado", "Não informado"); // chama o construtor completo
    }

    // Getters
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }

    // Metodo para exibir dados
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }
}