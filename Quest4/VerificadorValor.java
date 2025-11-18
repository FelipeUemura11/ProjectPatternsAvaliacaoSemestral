public class VerificadorValor extends VerificadorTransacao{
 
    @Override
    public boolean verificar(Transacao transacao) {

        if (transacao.getValor() > 10000) {
            System.out.println("Verificacao falhou: valor suspeito");
            return false;

        }
        System.out.println("Verificacao de valor: OK");

        if (proximo != null) {
            return proximo.verificar(transacao);
        }

        return true;
    }
}


