package classesandobjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        
        //primeira caneta
        Caneta c1 = new Caneta();
        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        //segunda caneta
        Caneta c2 = new Caneta();
        
        c2.cor = "vermelha";
        c2.ponta = 0.7f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
    }
    
}
