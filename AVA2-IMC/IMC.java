public class Imc {
    private Float baixoImc;
    private Float adequadoImc;
    private Float sobrepesoImc;
    private Float obesidadeg1Imc;
    private Float obesidadeg2Imc;
    private Float obesidadeg3Imc;

    //O construtor identifica a comparação do peso com o imc
        Public Imc (float baixoImc, float adequadoImc, float sobrepesoImc, float obesidadeg1Imc, float obesidadeg2Imc, float obesidadeg3Imc){
            this.baixoImc = baixoImc
            this.adequadoImc = adequadoImc
            this.sobrepesoImc = sobrepesoImc
            this.obesidadeg1Imc = obesidadeg1Imc
            this.obesidadeg2Imc = obesidadeg2Imc
            this.obesidadeg3Imc = obesidadeg3Imc
        }
    //método
    public static tipoImc(){
        public String tipeImc(float imc) {
            if (imc < baixoImc) {
                return "Baixo peso";
            } else if (imc >= baixoImc && imc < adequadoImc) {
                return "Baixo peso";
            } else if (imc >= adequadoImc && imc < sobrepesoImc) {
                return "Peso adequado";
            } else if (imc >= sobrepesoImc && imc < obesidadeg1Imc) {
                return "Sobrepeso";
            } else if (imc >= obesidadeg1Imc && imc < obesidadeg2Imc) {
                return "Obesidade tipo 1";
            } else if (imc >= obesidadeg2Imc && imc < obesidadeg3Imc) {
                return "Obesidade tipo 2";
            } else {
                return "Obesidade tipo 3";
            }

            
        }

}