public class VerificadorDispositivo extends VerificadorTransacao{

    @Override
    public boolean verificar(Transacao transacao){

        if (!transacao.isDispositivoConhecido()){
            System.out.println("Verificacao falhou: dispositivo incomum");
            return false;
        }

        System.out.println("Verificacao de dispositivo: OK");
        
        if (proximo != null) {
            return proximo.verificar(transacao);
        
        }
        return true;
    }
}


