package Aula12;

//@author João Pedro de Almeida dos Santos
//@email jp_almeida@id.uff.br
 
public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();
        
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setQtdMembros(4);
        m.setCorDoPelo("Marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("\n");
        
        r.setPeso(3.30f);
        r.setIdade(12);
        r.setQtdMembros(2);
        r.setCorDaEscama("Verde");
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("\n");
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setQtdMembros(0);
        p.setCorDaEscama("Vermelha");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        System.out.println("\n");
        
        a.setPeso(85.3f);
        a.setIdade(2);
        a.setQtdMembros(4);
        a.setCorDaPena("Branca");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        System.out.println("\n");
        
        m.status();
        r.status();
        p.status();
        a.status();
        
        c.setPeso(12.5f);
        c.setIdade(10);
        c.setQtdMembros(4);
        c.setCorDoPelo("Preto");
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        System.out.println("\n");
        
        k.setPeso(64.4f);
        k.setIdade(2);
        k.setQtdMembros(4);
        k.setCorDoPelo("Cinza");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.enterrarOsso();
        k.abanarRabo();
        System.out.println("\n");
        
        s.setPeso(2.00f);
        s.setIdade(5);
        s.setQtdMembros(0);
        s.setCorDaEscama("Laranja");
        s.locomover();
        s.alimentar();
        s.emitirSom();
        System.out.println("\n");
        
        t.setPeso(1.20f);
        t.setIdade(28);
        t.setQtdMembros(4);
        t.setCorDaEscama("Verde Musgo");
        t.locomover();
        t.alimentar();
        t.emitirSom();
        System.out.println("\n");
        
        g.setPeso(0.17f);
        g.setIdade(1);
        g.setQtdMembros(0);
        g.setCorDaEscama("Dourado");
        g.locomover();
        g.alimentar();
        g.emitirSom();
        System.out.println("\n");
        
        ar.setPeso(3.72f);
        ar.setIdade(6);
        ar.setQtdMembros(2);
        ar.setCorDaPena("Azul");
        ar.locomover();
        ar.alimentar();
        ar.emitirSom();
        System.out.println("\n");
        
        c.status();
        k.status();
        s.status();
        t.status();
        g.status();
        ar.status();
    }
    
}
