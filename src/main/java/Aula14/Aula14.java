package Aula14;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Aula14 {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 1 de JAVA");
        v[2] = new Video("Aula 1 de PHP");
        
        Aluno g[] = new Aluno[2];
        g[0] = new Aluno("KickSlapp", "JP", "M", 22);
        g[1] = new Aluno("Lambizzgoia", "IdUFF", "F", 80);
        
        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();
        vis[0].status();
        vis[1] = new Visualizacao(g[0], v[2]);
        vis[1].avaliar(87.0f);
        vis[1].status();
    }
    
}
