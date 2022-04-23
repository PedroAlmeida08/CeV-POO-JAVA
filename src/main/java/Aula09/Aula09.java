package Aula09;

public class Aula09 {
    
    public static void main(String[] args) {
        
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("JP", 22, "M");
        l[0] = new Livro("O Hobbit", "R. R. Tokien", 310, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPagina();
        l[0].detalhes();
        
        p[1] = new Pessoa("Julia", 11, "F");
        l[1] = new Livro("Anne", "Lucy M. Montegomery", 320, p[1]);
        l[1].detalhes();
        
        l[2] = new Livro("Harry Potter", "J. K. Rowling", 180, p[0]);
        l[2].detalhes();
    
    }
}
