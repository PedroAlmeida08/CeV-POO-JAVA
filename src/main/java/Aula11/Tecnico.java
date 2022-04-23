package Aula11;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Tecnico extends Aluno{

    private int registroProfissional;
    
    @Override
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Registro Profissional: " + this.getRegistroProfissional());
        System.out.println("\n");
    }
    
    public void praticar(){
        
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }   
}
