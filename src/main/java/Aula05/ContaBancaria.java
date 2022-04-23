package Aula05;

public class ContaBancaria {
    
    //Atributos
    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status;

    public ContaBancaria() {
        this.saldo = 0f;
        this.status = false;
    }
    
    public void info(){
        System.out.println("=== INFOMACOES DA CONTA ===");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        if(this.isStatus())
            System.out.println("Status: Aberta");
        else
            System.out.println("Status: Fechada");
        System.out.println("\n");
    }
    
    public void abrirConta(String tipo){
        
        this.setTipo(tipo);
        
        if("CC".equals(this.getTipo()))
            this.setSaldo(50);
        else if ("CP".equals(this.getTipo()))
            this.setSaldo(150);
        this.setStatus(true);
        
        System.out.println("Conta aberta com sucesso!");         
    }
    
    public void fecharConta(){
        float total = this.getSaldo();
        if(this.pagarMensal() && this.getSaldo() >= 0){
            this.sacar(this.getSaldo());
            this.setStatus(false);
            System.out.println("Conta fechada!");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Nao foi possivel fechar a sua conta!");
            System.out.println("Pague seus debitos antes de realizar o fechamento.");
            System.out.println("Saldo atual: R$" + this.getSaldo());
        }
        else{
            System.out.println("Nao foi possivel fechar a sua conta!");
            System.out.println("Realize o pagamento mensal antes de realizar o fechamento.");
        }
        System.out.println("\n");
    }
    
    public void depositar(float valor){
        float antigo = this.getSaldo();
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getNome());
            System.out.println("Valor do deposito R$" + valor);
            System.out.println("Saldo antigo: R$ " + antigo);
            System.out.println("Saldo atual: R$" + this.getSaldo());
        }
        else
            System.out.println("Nao eh possivel realizar deposito em uma conta fechada!");
        
        System.out.println("\n");
    }
    
    public void sacar(float valor){
        if(this.isStatus() && this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado no valor de R$" + valor);
            System.out.println("Novo saldo: R$" + this.getSaldo());
        }
        else if(this.getSaldo() <= 0){
            System.out.println("Erro durante a operacao!");
            System.out.println("Voce nao possui dinheiro em conta.");
        }
        else if(this.getSaldo() < valor){
            System.out.println("Erro durante a operacao!");
            System.out.println("O valor que deseja sacar eh maior do que o valor em conta.");
        }
        else
            System.out.println("Nao eh possivel realizar saque em uma conta fechada!");
        
        System.out.println("\n");
    }
    
    public boolean pagarMensal(){
        
        boolean paga;
        
        if("CC".equals(this.getTipo()))
            this.setSaldo(this.getSaldo() - 12);
        else if ("CP".equals(this.getTipo()))
            this.setSaldo(this.getSaldo() - 20);
        paga = true;
        System.out.println("Mensalidade paga!");
        System.out.println("\n");
        return paga;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
