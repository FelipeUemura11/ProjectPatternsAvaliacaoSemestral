public class VerificadorGeolocalizacao extends VerificadorTransacao{

    @Override
    public boolean verificar(Transacao transacao) {
    
        if (transacao.getLocalizacao().equals("Desconhecida")) {
            System.out.println("Verificacao falhou: localizacao suspeita");
            return false;
    
        }
        System.out.println("Verificacao de geolocalizacao: OK");
    
        if (proximo != null) {
            return proximo.verificar(transacao);
        }
    
        return true;
    }
}


