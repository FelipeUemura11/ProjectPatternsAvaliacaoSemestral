package Quest1;

public class RelatorioDiario implements Relatorio {
    @Override
    public void preparar() {
        System.out.println(" > Preparando relatorio diario: coletando dados do dia atual");
    }

    @Override
    public void gerar() {
        System.out.println(" > Gerando relatorio diario em formato simplificado");
    }
}

