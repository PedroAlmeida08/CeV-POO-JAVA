package Aula13;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Mamifero extends Animal{

    protected String corDoPelo;

    @Override
    public void emitirSom() {
        System.out.println("... som de mamifero ...");
    }
    
}
