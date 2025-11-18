public class Main {
    public static void main(String[] args) {

        VerificadorTransacao verificadorValor = new VerificadorValor();
        VerificadorTransacao verificadorGeo = new VerificadorGeolocalizacao();
        VerificadorTransacao verificadorHistorico = new VerificadorHistorico();
        VerificadorTransacao verificadorDispositivo = new VerificadorDispositivo();

        verificadorValor.setProximo(verificadorGeo);
        verificadorGeo.setProximo(verificadorHistorico);
        verificadorHistorico.setProximo(verificadorDispositivo);

        Transacao transacao1 = new Transacao(5000, "Brasil", true, true);
        System.out.println("Processando transacao 1:");

        boolean resultado1 = verificadorValor.verificar(transacao1);
        System.out.println("Resultado: " + (resultado1 ? "APROVADA" : "RECUSADA"));

        System.out.println("\nProcessando transacao 2:");
        Transacao transacao2 = new Transacao(15000, "Brasil", true, true);
        
        boolean resultado2 = verificadorValor.verificar(transacao2);
        System.out.println("Resultado: " + (resultado2 ? "APROVADA" : "RECUSADA"));
    }
}


