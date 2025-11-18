public class Main {
    public static void main(String[] args) {

        Sensor sensorTemperatura = new Sensor("Temperatura");
        
        PainelControle painel = new PainelControle();
        ModuloAlertas alertas = new ModuloAlertas();
        RegistroHistorico historico = new RegistroHistorico();

        sensorTemperatura.adicionarObserver(painel);
        sensorTemperatura.adicionarObserver(alertas);
        sensorTemperatura.adicionarObserver(historico);

        System.out.println("Atualizando sensor de temperatura para 25:");
        sensorTemperatura.setValor(25);

        System.out.println("\nAtualizando sensor de temperatura para 65:");
        sensorTemperatura.setValor(65);
    }
}


