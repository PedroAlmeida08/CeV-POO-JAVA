package Aula14;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Visualizacao {

    private Aluno espectador;
    private Video filme;

    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.viuMaisUm();
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porcentagem){
        int tot;
        if(porcentagem <= 20)
            tot = 3;
        else if(porcentagem <= 50)
            tot = 5;
        else if(porcentagem <= 90)
            tot = 8;
        else
            tot = 10;
        
        this.filme.setAvaliacao(tot);
    }
    
    public void status(){
        System.out.println(espectador.getNome() + " esta assistindo " + filme.getTitulo());
        System.out.println("\n");
        System.out.println("===== Espectador =====");
        espectador.status();
        System.out.println("===== Video =====");
        filme.status();
        System.out.println("\n");
    }

    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
