package Aula11;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Bolsista extends Aluno{

    private float bolsa;
    
    @Override
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Bolsa de " + this.getBolsa() + "%");
        System.out.println("\n");
    }
    
    public void renovarBolsa(){
        
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + "eh bolsista! Pagamento facilitado. ");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }   
}
