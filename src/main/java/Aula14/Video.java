package Aula14;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Video implements AcoesVideo{

    private String titulo;
    private float avaliacao;
    private int views, curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    @Override
    public void play() {
        if(this.isReproduzindo())
            System.out.println("O video ja esta sendo reproduzido!");
        else{
            System.out.println("Video despausado!");
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if(this.isReproduzindo())
            System.out.println("Video pausado!");
        else{
            System.out.println("O video ja esta pausado!");
            this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public void status(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Avaliacao: " + this.getAvaliacao() +" estrela(s)");
        System.out.println("Views: " + this.getViews());
        System.out.println("Curtidas: " + this.getCurtidas());
        if(this.isReproduzindo())
            System.out.println("O video esta sendo reproduzido ...");
        else
            System.out.println("O video esta pausado ...");
        System.out.println("\n");
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    
}