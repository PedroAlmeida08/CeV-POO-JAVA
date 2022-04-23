package Aula05;

public class Aula05 {
    
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria();
        p1.setNumConta(1111);
        p1.setNome("Jubileu");
        p1.abrirConta("CC");
        p1.info();
        p1.depositar(100);
        p1.fecharConta();
        p1.info();
        
        ContaBancaria p2 = new ContaBancaria();
        p2.setNumConta(2222);
        p2.setNome("Creuza");
        p2.abrirConta("CP");
        p2.info();
        p2.depositar(500);
        p2.sacar(100);
    }
}
