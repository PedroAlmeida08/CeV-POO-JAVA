package Aula11;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Professor extends Pessoa{

    private String especialidade;
    private float salario;
    
    @Override
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salario: R$" + this.getSalario());
        System.out.println("\n");
    }
    
    public void receberSalario(float aum){
        this.setSalario(this.getSalario() + aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
        
}
