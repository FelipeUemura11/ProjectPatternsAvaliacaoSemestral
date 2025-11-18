public class RegistroHistorico implements Observer{
    @Override
    public void atualizar(String tipoSensor, double valor) {
        System.out.println("[Registro Historico] Salvando: " + tipoSensor + " = " + valor);
    }
}


