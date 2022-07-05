package ResolucaoGFT;

public class EleicaoPresidencial {
    public int votosTotais = 0;
    public int votosCandidato1 = 0;
    public int votosCandidato2 = 0;    
    public int votosCandidato3 = 0;    
    public int votosCandidato4 = 0;    
    public int votosEmBranco = 0;
    public int votosNulos = 0;
    
    public void votar(int numeroCandidato){
        if(numeroCandidato == 1){
            votosCandidato1++;
        }
        if(numeroCandidato == 2){
            votosCandidato2++;
        }
        if(numeroCandidato == 3){
            votosCandidato3++;
        }
        if(numeroCandidato == 4){
            votosCandidato4++;
        }
        if(numeroCandidato == 5){
            votosEmBranco++;
        }
        if(numeroCandidato == 6){
            votosNulos++;
        }

        votosTotais++;

        System.out.println("Votos candidato 1: " + votosCandidato1);
        System.out.println("Votos candidato 2: " + votosCandidato2);
        System.out.println("Votos candidato 3: " + votosCandidato3);
        System.out.println("Votos candidato 4: " + votosCandidato4);
        System.out.println("Votos em branco: " + votosEmBranco);
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Percentagem de votos em branco: " + ((votosEmBranco/votosTotais) * 100) + "%");
        System.out.println("Percentagem de votos nulos: " + ((votosNulos/votosTotais) * 100) + "%");   
    }
}
