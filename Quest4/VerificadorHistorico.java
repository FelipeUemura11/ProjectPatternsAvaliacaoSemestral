public class VerificadorHistorico extends VerificadorTransacao{
    @Override
    public boolean verificar(Transacao transacao){
        if (!transacao.isUsuarioConfiavel()){
            System.out.println("Verificacao falhou: historico do usuario suspeito");
            return false;

        }

        System.out.println("Verificacao de historico: OK");

        if (proximo != null) {
            return proximo.verificar(transacao);
        }

        return true;
    }
}


