public class Cliente extends Pessoa {
    private String logradouroEndereco;
    private String nrEndereco;
    private String complementoEndereco;
    private String bairroEndereco;
    private String cidadeEndereco;
    private String ufEndereco;
    private String cepEndereco;
    private String telefoneCliente;

    // Construtor inicia dados de Pessoa e específicos de Cliente
    public Cliente(
        String cpfPessoa,
        String nomePessoa,
        String logradouroEndereco,
        String nrEndereco,
        String complementoEndereco,
        String bairroEndereco,
        String cidadeEndereco,
        String ufEndereco,
        String cepEndereco,
        String telefoneCliente
    ) {
        super(cpfPessoa, nomePessoa);      // chama construtor da superclasse  
        this.logradouroEndereco = logradouroEndereco;
        this.nrEndereco         = nrEndereco;
        this.complementoEndereco= complementoEndereco;
        this.bairroEndereco     = bairroEndereco;
        this.cidadeEndereco     = cidadeEndereco;
        this.ufEndereco         = ufEndereco;
        this.cepEndereco        = cepEndereco;
        this.telefoneCliente    = telefoneCliente;
    }

     /**
     * Método de manutenção específico para Cliente.
     */
    public void manterCliente() {
        System.out.printf(
            "Mantendo dados de Cliente: %s (%s)%n",
            nomePessoa, cpfPessoa
            
        );                                  // simula operação de CRUD  
    }
}

