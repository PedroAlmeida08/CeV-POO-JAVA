package Aula11;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;
    
    @Override
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Setor: " + this.getSetor());
        if(this.isTrabalhando())
            System.out.println(this.getNome() + " esta trabalhando no momento.");
        else
            System.out.println(this.getNome() + " esta descansando no momento.");
        System.out.println("\n");
    }
    
    public void mudarTrabalho(){
        this.setTrabalhando(!this.isTrabalhando()); 
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
