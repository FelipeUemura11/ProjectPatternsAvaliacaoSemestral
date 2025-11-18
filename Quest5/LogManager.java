public class LogManager{
    
    private static volatile LogManager instancia;

    private LogManager() {
        if (instancia != null) {
            throw new RuntimeException("Use getInstance() para obter a instancia");
        }
    }

    public static LogManager getInstance() {
        if (instancia == null) {
            synchronized (LogManager.class) {
                if (instancia == null) {
                    instancia = new LogManager();
                }
            }
        }
        return instancia;
    }

    public void registrarErro(String mensagem) {
        System.out.println("[ERRO] " + mensagem);
    }

    public void registrarEvento(String mensagem) {
        System.out.println("[EVENTO] " + mensagem);
    }

    public void registrarAuditoria(String mensagem) {
        System.out.println("[AUDITORIA] " + mensagem);
    }
}


