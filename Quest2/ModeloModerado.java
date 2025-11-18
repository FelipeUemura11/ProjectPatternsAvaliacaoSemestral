public class ModeloModerado implements CalculoRisco{

    @Override
    public double calcular(double valorInvestimento, int idade, double rendaMensal){
        double risco = (valorInvestimento * 0.5) + (rendaMensal * 0.3) - (idade * 0.2);
    
        System.out.println("Calculando perfil moderado: " + risco);
        return risco;
    }
}


