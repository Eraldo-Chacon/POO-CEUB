public class Cliente { //nome completo, CPF, endereço completo e telefone    
    private String nomeCompleto; //primeiro atributo
    private String CPF; //segundo atributo
    private String enderecoCompleto; // terceiro atributo
    private int telefone; // quarto atributo
// construtor
    public Cliente(String nomeCompleto, String CPF, String enderecoCompleto, int telefone) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.enderecoCompleto = enderecoCompleto;
        this.telefone = telefone;
    }
// getters e setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }
    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}