public class ModuloAlertas implements Observer{

    @Override
    public void atualizar(String tipoSensor, double valor){

        if (valor > 50) {
            System.out.println("[Modulo de Alertas] ALERTA: " + tipoSensor + " acima do limite: " + valor);
        }
        
    }
}


