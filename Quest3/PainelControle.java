public class PainelControle implements Observer{
    
    @Override
    public void atualizar(String tipoSensor, double valor) {
        System.out.println("[Painel de Controle] Sensor " + tipoSensor + " atualizado: " + valor);
    }
}


