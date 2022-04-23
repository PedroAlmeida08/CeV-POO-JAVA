package Aula08;

public class Aula07 {
    
    public static void main(String[] args) {
        
        ImplLutador l[] = new ImplLutador[6];
        
        l[0] = new ImplLutador("Pretty Boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new ImplLutador("Putscript", "Brazil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new ImplLutador("Snapshadow", "USA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new ImplLutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new ImplLutador("Ufocobol", "Brazil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new ImplLutador("Nerdaard", "USA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        ImplLuta lt[] = new ImplLuta[4];
        
        lt[0] = new ImplLuta(l[0], l[1]);
        lt[0].marcarLuta(l[0], l[1]);
        lt[0].lutar(l[0], l[1]);
        
        l[0].status();
        l[1].status();
        
        lt[1] = new ImplLuta(l[0], l[0]);
        lt[1].marcarLuta(l[0], l[0]);
        lt[1].lutar(l[0], l[0]);
        
        lt[2] = new ImplLuta(l[0], l[3]);
        lt[2].marcarLuta(l[0], l[3]);
        lt[2].lutar(l[0], l[3]);
         
        lt[3] = new ImplLuta(l[4], l[5]);
        lt[3].marcarLuta(l[4], l[5]);
        lt[3].lutar(l[4], l[5]);
        
        l[4].status();
        l[5].status();
    }
    
    
    
}
