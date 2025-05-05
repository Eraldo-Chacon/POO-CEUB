public abstract class Pessoa { //PARA LEMBRAR toda superclasse tem que ser composta pelo comando abstract "abstract class"
    protected String cpfPessoa;  
    protected String nomePessoa;
    protected String telefonePessoa;
    protected String emailPessoa;

    

    // Construtor que inicializa CPF e nome
    public Pessoa(String cpfPessoa, String nomePessoa, String telefonePessoa, String emailPessoa) {
        this.cpfPessoa = cpfPessoa;  
        this.nomePessoa = nomePessoa;  
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;

    }
    //Método manter para os atributos
    public void manterPessoa() {
        System.out.printf(
            "Mantendo dados de Pessoa: %s (%s)%n",
            nomePessoa, cpfPessoa
        );                           
    }
}
