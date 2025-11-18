public class AnalisadorInvestimentos {

    private CalculoRisco estrategia;

    public void setEstrategia(CalculoRisco estrategia){
        this.estrategia = estrategia;
    }

    public double analisar(double valorInvestimento, int idade, double rendaMensal){

        if (estrategia == null){
            throw new IllegalStateException(" >> Estrategia de calculo nao definida << ");
        }

        return estrategia.calcular(valorInvestimento, idade, rendaMensal);
    }
}


