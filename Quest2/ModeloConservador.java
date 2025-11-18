public class ModeloConservador implements CalculoRisco{

    @Override
    public double calcular(double valorInvestimento, int idade, double rendaMensal){
        double risco = (valorInvestimento * 0.2) + (rendaMensal * 0.1) - (idade * 0.5);
        System.out.println("Calculando perfil conservador: " + risco);
        
        return risco;
    }
}


