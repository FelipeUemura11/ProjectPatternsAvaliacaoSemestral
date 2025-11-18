package Quest1;

public abstract class RelatorioFactory {
    
    public abstract Relatorio criarRelatorio();

    public void processarRelatorio() {
        Relatorio relatorio = criarRelatorio();
        relatorio.preparar();
        relatorio.gerar();
    }
}

