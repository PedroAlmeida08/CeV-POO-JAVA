package Aula04;

public class Caneta {
    
    private String modelo;
    private float ponta;
    private String cor;
    private int carga;
    private boolean tampada;
    
    public Caneta(String m, float p, String cor, int c, boolean t){
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(cor);
        this.setCarga(c);
        this.setTampada(t);
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("O modelo da caneta eh " + this.getModelo());
        System.out.println("A cor da caneta eh " + this.getCor());
        System.out.println("A ponta da caneta eh " + this.getPonta());
        System.out.println("A caneta tem " + this.getCarga() + "% de carga.");
        if(this.isTampada())System.out.println("A caneta esta tampada!");
        else System.out.println("A caneta esta destampada!");
        System.out.println("\n");
    }
    
    void rabiscar(){
        if(this.tampada) System.out.println("ERRO, a caneta esta tampada!");
        else System.out.println("Estou rabiscando!");
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}