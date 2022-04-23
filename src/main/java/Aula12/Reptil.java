package Aula12;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Reptil extends Animal{

    private String corDaEscama;
    
    @Override
    public void status() {
        System.out.println("Classe: Reptil");
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Qtdd de Membros: " + this.getQtdMembros());
        System.out.println("Cor da Escama: " + this.getCorDaEscama());
        System.out.println("\n");
    }
    
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    };
    
    @Override
    public void alimentar(){
        System.out.println("Insetos");
    };
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Reptil");
    };

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
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
