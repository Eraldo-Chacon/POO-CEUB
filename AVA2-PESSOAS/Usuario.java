public class Usuario {
    private String idUsuario
    
    //contrutor
public Usuario (
    String idUsuario
    String cpfPessoa,  
    String nomePessoa,
    String telefonePessoa,
    String emailPessoa,
        )
    {
        super(cpfPessoa, nomePessoa);      // chama construtor da superclasse  
        this.idUsuario = idUsuario;
        this.cpfPessoa = cpfPessoa;
        this.nomePessoa = nomePessoa;
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;
    }

        //atributo

        public String manterUsuario() {}

}