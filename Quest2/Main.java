public class Main {
    public static void main(String[] args){

        AnalisadorInvestimentos analisador = new AnalisadorInvestimentos();

        analisador.setEstrategia(new ModeloAgressivo());
        analisador.analisar(50000, 30, 8000);

        analisador.setEstrategia(new ModeloModerado());
        analisador.analisar(50000, 30, 8000);

        analisador.setEstrategia(new ModeloConservador());
        analisador.analisar(50000, 30, 8000);
    }
}
