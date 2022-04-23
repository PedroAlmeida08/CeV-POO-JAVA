package Aula12;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Mamifero extends Animal{

    private String corDoPelo;
    
    @Override
    public void status() {
        System.out.println("Classe: Mamifero");
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Qtdd de Membros: " + this.getQtdMembros());
        System.out.println("Cor do Pelo: " + this.getCorDoPelo());
        System.out.println("\n");
    }
    
    @Override
    public void locomover(){
        System.out.println("Correndo");
    };
    
    @Override
    public void alimentar(){
        System.out.println("Leite Materno");
    };
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    };

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdMembros() {
        return qtdMembros;
    }

    public void setQtdMembros(int qtdMembros) {
        this.qtdMembros = qtdMembros;
    }  
}
