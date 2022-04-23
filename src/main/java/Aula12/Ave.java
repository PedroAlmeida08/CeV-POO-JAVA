package Aula12;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Ave extends Animal{

    private String corDaPena;
    
    @Override
    public void status() {
        System.out.println("Classe: Ave");
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Qtdd de Membros: " + this.getQtdMembros());
        System.out.println("Cor da Pena: " + this.getCorDaPena());
        System.out.println("\n");
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    };
    
    @Override
    public void alimentar(){
        System.out.println("Frutas");
    };
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    };
    
    public void fazerNinho(){
        System.out.println("Construindo um ninho ...");
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
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
