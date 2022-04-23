package Aula04;

public class Aula04{
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("DeskJet", 0.5f, "Rosa", 43, false);        
        c1.status();  
        
        Caneta c2 = new Caneta("Jocar Office", 0.9f, "Preta", 78, true);
        c2.status();
    }
}
