package Aula14;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Aluno extends Pessoa{

    private String login;
    private int totAssistido;

    public Aluno(String login, String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }
    
    @Override
    public void status(){
        super.status();
        System.out.println("Login: " + this.getLogin());
        System.out.println("Experiencia: " + this.getExperiencia() + "%");
        System.out.println("Total de videos assitidos: " + this.getTotAssistido());
        System.out.println("\n");
    }
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
        this.setExperiencia(this.getExperiencia() + 5f);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
