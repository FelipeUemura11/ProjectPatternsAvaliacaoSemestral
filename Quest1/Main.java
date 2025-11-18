package Quest1;

public class Main {
    public static void main(String[] args) {

        RelatorioFactory factory1 = new RelatorioDiarioFactory();
        RelatorioFactory factory2 = new RelatorioSemanalFactory();
        
        System.out.println();
        
        factory1.processarRelatorio();
        factory2.processarRelatorio();
    }
}
 