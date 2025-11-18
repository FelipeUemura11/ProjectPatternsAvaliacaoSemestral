public class Transacao{
    
    private double valor;
    private String localizacao;
    private boolean usuarioConfiavel;
    private boolean dispositivoConhecido;

    public Transacao(double valor, String localizacao, boolean usuarioConfiavel, boolean dispositivoConhecido){
        this.valor = valor;
        this.localizacao = localizacao;
        this.usuarioConfiavel = usuarioConfiavel;
        this.dispositivoConhecido = dispositivoConhecido;
    }

    public double getValor() {
        return valor;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public boolean isUsuarioConfiavel() {
        return usuarioConfiavel;
    }

    public boolean isDispositivoConhecido() {
        return dispositivoConhecido;
    }
}


