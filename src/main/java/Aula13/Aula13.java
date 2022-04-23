package Aula13;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.reagir("Ola");
        c.reagir("Vai apanhar!");
        c.reagir(11,45);
        c.reagir(21,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2,12.5f);
        c.reagir(17, 4.5f);
        
    }
}
