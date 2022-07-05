package ResolucaoGFT;

public class EleicaoPresidencialTeste extends EleicaoPresidencial{
    public static void main(String[] args) {
        EleicaoPresidencial eleicao = new EleicaoPresidencial();    
        int numeroCandidato = 2;
        eleicao.votar(numeroCandidato);
    }
}
