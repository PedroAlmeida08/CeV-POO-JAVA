package Aula06;

public class Aula06 {
    
    public static void main(String[] args) {
        Controle ct = new Controle();
        ct.ligar();
        ct.abrirMenu();
        ct.maisVolume();
        ct.abrirMenu();
        ct.maisVolume();
        ct.abrirMenu();
        ct.ligarMudo();
        ct.pause();
        ct.abrirMenu();
        ct.menosVolume();
        ct.abrirMenu();
        ct.play();
        ct.desligarMudo();
        ct.abrirMenu();
        ct.fecharMenu();
    }
    
}
