package Aula12;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Canguru extends Mamifero{

    public void usarBolsa(){
        System.out.println("Usando bolsa ...");
    }
        
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
}
