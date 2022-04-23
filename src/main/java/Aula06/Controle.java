package Aula06;

public class Controle implements Controlador{
    
    private int volume;
    private int volumeAntigo;
    private boolean ligado;
    private boolean tocando;

    public Controle() {
        this.volume = 50;
        this.volumeAntigo = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private int getVolumeAntigo() {
        return volumeAntigo;
    }

    private void setVolumeAntigo(int volumeAntigo) {
        this.volumeAntigo = volumeAntigo;
    }
    
    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    @Override
    public void ligar(){
        if(!this.isLigado()){
            this.setLigado(true);
            this.setTocando(true);
        }
    }
    
    @Override
    public void desligar(){
        if(this.isLigado()){
            this.setTocando(false);
            this.setLigado(false);
        }
    }
    
    @Override
    public void abrirMenu(){
        if(this.isLigado()){
            System.out.println("----- MENU -----");
            System.out.println("Aparelho Ligado");
            if(this.getVolume() != 0)
                System.out.println("Volume: " + this.getVolume());
            else
                System.out.println("Volume MUDO");
            if(!this.isTocando())
                System.out.println("Vídeo pausado!");
        }
        else
            System.out.println("Aparelho Desligado");
        System.out.println("\n");
    }
    
    @Override
    public void fecharMenu(){
        
        if(this.isLigado())
            System.out.println("... Fechando Menu ...");
        else
            System.out.println("Aparelho Desligado");
    }
    
    @Override
    public void maisVolume(){
        if(this.isLigado() )
            //Verifica se estava no mudo
            if(this.getVolume() == 0)
                this.setVolume(this.getVolumeAntigo() + 5);
            else
                this.setVolume(this.getVolume() + 5);
    }
    
    @Override
    public void menosVolume(){
        if(this.isLigado())
            //Verifica se estava no mudo
            if(this.getVolume() == 0)
                this.setVolume(this.getVolumeAntigo() - 5);
            else
                this.setVolume(this.getVolume() - 5);
    }
    
    @Override
    public void ligarMudo(){
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolumeAntigo(this.getVolume());
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo(){
        if(this.isLigado() && this.getVolume() == 0)
            this.setVolume(this.getVolumeAntigo());
    }
    
    @Override
    public void play(){
        if(this.isLigado() && !this.isTocando())
            this.setTocando(true);
    }
    
    @Override
    public void pause(){
        if(this.isLigado() && this.isTocando())
            this.setTocando(false);
    }
    
}
