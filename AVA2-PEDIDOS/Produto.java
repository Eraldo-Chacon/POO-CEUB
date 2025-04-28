class Produto { // Classe Principal: Representa um produto no marketplace
    // Atributos
    private String codigoProduto;
    private String descricaoProduto;
    private double precoUnitario;

    // Construtor
    public Produto(String codigoProduto, String descricaoProduto, double precoUnitario) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoUnitario = precoUnitario >= 0 ? precoUnitario : 0;
    }

    // Métodos: Getters para todos os atributos
    public String getCodigo() {
        return codigoProduto;
    }

    public String getDescricao() {
        return descricaoProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    // Setters para atributos mutáveis
    public void setcodigoProduto(String codigo) {
        this.codigoProduto = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricaoProduto = descricao;
    }
}
