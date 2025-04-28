// Classe Principal: Representa o empregado da Swexato
class Vendedor {
    // Atributos
    private String nomeCompleto;
    private String matricula;

    // Construtor
    public Vendedor(String nomeCompleto, String matricula) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
    }

    // Métodos: Getters para todos os atributos
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    // Setters para atributos mutáveis
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
