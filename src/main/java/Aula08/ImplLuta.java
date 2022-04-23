package Aula08;

import java.util.Random;

public class ImplLuta implements Luta{
    
    private ImplLutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;
    private String motivo;

    public ImplLuta(ImplLutador desafiado, ImplLutador desafiante) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.aprovada = false;
    }

    public ImplLutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(ImplLutador desafiado) {
        this.desafiado = desafiado;
    }

    public ImplLutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(ImplLutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public void marcarLuta(ImplLutador l1, ImplLutador l2) {
        // Regra 1 - Um lutador não pode lutar com ele mesmo
        // Regra 2 - Se os lutadores não forem da mesma categoria, a luta não será aprovada
        if(l1.getCategoria().equals(l2.getCategoria()) && !(l1.getNome().equals(l2.getNome()))){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            if(!(l1.getCategoria().equals(l2.getCategoria())))
                this.setMotivo("lutadores de categorias diferentes");
            else
                this.setMotivo("um lutador nao pode lutar contra ele mesmo");
        }
    }

    @Override
    public void lutar(ImplLutador l1, ImplLutador l2) {
        
        if(!(this.isAprovada())){
            System.out.println("Esta luta nao esta autorizada a acontecer!");
            System.out.println("Motivo: " + this.motivo + "!");
            System.out.println("\n");
        }
        else{
            System.out.println("===== DESAFIADO =====");
            l1.apresentar();
            System.out.println("===== DESAFIANTE =====");
            l2.apresentar();
            
            // Sorteia um número entre 0 e 2 para determinar o resultado da luta
            Random gerador = new Random();
            int vencedor = gerador.nextInt(3); // 0, 1 ou 2
            System.out.println("===== RESULTADO =====");
            switch (vencedor) {
                // 0 == Empate
                case 0:
                    l1.empatarLuta();
                    l2.empatarLuta();
                    break;
                // 1 == Lutador 1 (desafiado) vence
                case 1:
                    System.out.println(l1.getNome() + " venceu!");
                    l1.ganharLuta();
                    l2.perderLuta();
                    break;
                // 2 == Lutador 2 (desafiante) vence
                case 2:
                    System.out.println(l2.getNome() + " venceu!");
                    l1.perderLuta();
                    l2.ganharLuta();
                    break;
            }
            System.out.println("=====================");
            System.out.println("\n");
        }
    }
}
