public abstract class VerificadorTransacao{

    protected VerificadorTransacao proximo;

    public void setProximo(VerificadorTransacao proximo) {
        this.proximo = proximo;
    }

    public abstract boolean verificar(Transacao transacao);
}


