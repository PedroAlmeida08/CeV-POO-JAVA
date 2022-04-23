package Aula09;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("===== LIVRO =====");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor : " + this.getAutor());
        System.out.println("Total de Paginas : " + this.getTotPaginas());
        System.out.println("Pagina Atual : " + this.getPagAtual());
        if(this.isAberto())
            System.out.println("O livro esta aberto!");
        else
            System.out.println("O livro esta fechado!");
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("\n");
        
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.isAberto()){
            if(p <= this.getTotPaginas())
                this.setPagAtual(p);
            else
                System.out.println("Esse livro nao tem " + p + " paginas!");
        }
        else
            System.out.println("O livro esta fechado, nao eh possivel folhear paginas!");
    }

    @Override
    public void avancarPagina() {
       if(this.isAberto()){     
            if((this.getPagAtual() + 1) <= this.getTotPaginas())
                this.setPagAtual(this.getPagAtual() + 1);
            else
                System.out.println("O livro ja esta na ultima pagina!");
       }
       else
            System.out.println("O livro esta fechado, nao eh possivel avancar paginas!");
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()){ 
            if((this.getPagAtual() - 1) >= 0)
                this.setPagAtual(this.getPagAtual() - 1);
            else
                System.out.println("O livro ja esta na primeira pagina!");
        }
        else
            System.out.println("O livro esta fechado, nao eh possivel voltar paginas!");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
