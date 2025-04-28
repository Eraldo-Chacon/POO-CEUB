import java.time.LocalDateTime; // O java não trabalha mais com o tipo de dado "date" e "time", portanto é necessário importar a classe LocalDateTime para manipulação de data e hora, é uma classe do pacote java.time
import java.util.ArrayList; // Importa a classe ArrayList para manipulação de listas dinâmicas, é uma classe do pacote java.util
import java.util.List; // Importa a interface List para manipulação de listas, é uma interface do pacote java.util
// Importa as classes necessárias para o funcionamento do pedido

// Enum para o status do pedido, garantindo valores consistentes
enum StatusPedido {
    EM_PROCESSAMENTO, ENVIADO, ENTREGUE, CANCELADO
}

// Classe Principal: Representa um pedido no marketplace, coordenando cliente, vendedor e itens
public class Pedido {
    // Atributos: Dados do pedido conforme os requisitos
    private String idPedido; // Identificador único do pedido, optei por String para diversificar o id, poderia ser um UUID
    private LocalDateTime dataHora; // Data e hora do pedido
    private Cliente cliente; // Cliente apanha as informações da classe Cliente
    private Vendedor vendedor; // Vendedor apanha as informações da classe Vendedor
    private StatusPedido status; // Status do pedido utiliza o tipo especial para listas estáticas "enum"(em processamento, enviado, entregue, cancelado)
    private double valorTotal; // Valor total do pedido (soma dos itens menos descontos)
    private List<ItemPedido> itens; // Lista de itens do pedido

    // Construtor: Inicializa um novo pedido com valores padrão
    public Pedido(String idPedido, Cliente cliente, Vendedor vendedor) {
        this.idPedido = idPedido;
        this.dataHora = LocalDateTime.now(); // Data e hora no momento do registro do pedido
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.status = StatusPedido.EM_PROCESSAMENTO; // Status do pedido utiliza o tipo especial para listas estáticas "enum"(em processamento, enviado, entregue, cancelado)
        this.valorTotal = 0.0; // Inicializa como 0, será calculado
        this.itens = new ArrayList<>(); // Lista vazia de itens
    }

    // Métodos: Comportamentos do pedido, incluindo getters, setters e funcionalidades específicas

    // Get para o id de cada pedido
    public String getIdPedido() {
        return idPedido;
    }

    // Get para a data e hora
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    // Get para o cliente
    public Cliente getCliente() {
        return cliente;
    }

    // "Seta" o cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Get para o vendedor
    public Vendedor getVendedor() {
        return vendedor;
    }

    // Apanha os dados do vendedor
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    // Get para o status
    public StatusPedido getStatus() {
        return status;
    }

    // Método para atualizar o status, com validação básica
    public void atualizarStatus(StatusPedido novoStatus) {
        if (novoStatus == StatusPedido.EM_PROCESSAMENTO && status != null) {
            throw new IllegalStateException("Não pode voltar para Em processamento");
        }
        this.status = novoStatus;
    }

    // Get para o valor total
    public double getValorTotal() {
        return valorTotal;
    }

    // Get para a lista de itens
    public List<ItemPedido> getItens() {
        return new ArrayList<>(itens); // Retorna uma cópia para proteger a lista
    }

    // Cálculo da Somatória dos Valores: Calcula o valor total com base nos itens
    public void calcularValorTotal() {
        valorTotal = itens.stream()
                         .mapToDouble(ItemPedido::calcularSubtotal) // Soma os subtotais dos itens
                         .sum();
    }
    
}