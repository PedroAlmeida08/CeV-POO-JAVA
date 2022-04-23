package Aula12;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public abstract class Animal {

    protected float peso;
    protected int idade;
    protected int qtdMembros;
    
    public abstract void status();
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
