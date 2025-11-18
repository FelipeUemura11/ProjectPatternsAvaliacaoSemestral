public class Main{
    public static void main(String[] args){
        
        LogManager logger1 = LogManager.getInstance();
        LogManager logger2 = LogManager.getInstance();

        System.out.println("logger1 e logger2 sao a mesma instancia? " + (logger1 == logger2));

        logger1.registrarErro("Falha na conexao com banco de dados");
        logger2.registrarEvento("Usuario fez login no sistema");
        logger1.registrarAuditoria("Transacao financeira realizada");
    }
}


