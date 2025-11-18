package Quest1;

public class RelatorioSemanal implements Relatorio {

    @Override
    public void preparar() {
        System.out.println(" >> Preparando relatorio semanal - agregando dados dos ultimos 7 dias");
    }

    @Override
    public void gerar() {
        System.out.println(" >> Gerando relatorio semanal com metricas consolidadas");
    }
}

