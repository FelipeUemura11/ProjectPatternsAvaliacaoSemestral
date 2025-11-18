public class ModeloAgressivo implements CalculoRisco {

    @Override
    public double calcular(double valorInvestimento, int idade, double rendaMensal){
        double risco = (valorInvestimento * 0.8) + (rendaMensal * 0.5) - (idade * 0.1);

        System.out.println("Calculando perfil agressivo: " + risco);
        
        return risco;
    }
}


