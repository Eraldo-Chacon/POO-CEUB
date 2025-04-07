//Criar a classe, nesse caso criar a classe Pessoa "<<visibilidade>> class <<home class>>"
public class Pessoa {
    //métodos são variáveis declaradas no inicio da codificação
    private String nomePessoa;
    private Double pesoPessoa;
    private Double alturaPessoa;
    private Double imcPessoa;
// Construtor da Classe Pessoa
        public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
            this.nomePessoa = nomePessoa;
            this.pesoPessoa = pesoPessoa;
            this.alturaPessoa = alturaPessoa;
            this.imcPessoa = calcularImcPessoa(pesoPessoa, alturaPessoa);
            }
                // Método para cálculo do IMC da Classe Pessoa
                private static double calcularImcPessoa(double peso, double altura) {
                    double imc = 0.0;
                    //Fórmula do IMC = Peso ÷ (Altura × Altura)
                    imc = peso / ( Math.pow(altura, 2) );
                    return imc;
                }
                // Método para mostrar a Pessoa e resultado do cálculo do IMC
                public void mostrarImcPessoa(){
                    System.out.println("Nome:" + this.nomePessoa);
                    System.out.println("Peso:" + this.pesoPessoa);
                    System.out.println("Altura:" + this.alturaPessoa);
                    System.out.println("IMC:" + this.imcPessoa);
                }

    }
    