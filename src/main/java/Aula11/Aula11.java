package Aula11;

public class Aula11 {
    public static void main(String[] args) {
    
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Visitante p5 = new Visitante();
        Bolsista p6 = new Bolsista();
        Tecnico p7 = new Tecnico();
        
        p1.setNome("Pedro");
        p1.setIdade(22);
        p1.setSexo("M");
        p2.setNome("Maria");
        p2.setIdade(12);
        p2.setSexo("F");
        p2.setMatricula(220031145);
        p2.setCurso("Tecnologia");
        p3.setNome("Claudio");
        p3.setIdade(54);
        p3.setSexo("M");
        p3.setSalario(2357.89f);
        p3.setEspecialidade("Mestre em Matematica");
        p4.setNome("Fabiana");
        p4.setIdade(36);
        p4.setSexo("F");
        p4.setSetor("Coordenacao");
        p4.setTrabalhando(true);
        p5.setNome("Joao");
        p5.setIdade(11);
        p5.setSexo("M");
        p6.setNome("Ana");
        p6.setIdade(14);
        p6.setSexo("F");
        p6.setMatricula(11102204);
        p6.setCurso("Publicidade");
        p6.setBolsa(25);
        p7.setNome("Bruna");
        p7.setIdade(27);
        p7.setSexo("F");
        p7.setMatricula(10161860);
        p7.setCurso("Propaganda");
        p7.setRegistroProfissional(22042022);
        
        p1.status();
        p2.status();
        p3.status();
        p4.status();    
        p5.status();
        p6.status();
        p7.status();        
    }
}
