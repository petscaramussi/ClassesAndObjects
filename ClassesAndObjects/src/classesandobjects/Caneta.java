package classesandobjects;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("ponta " + this.ponta);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não pode rabiscar porque a caneta esta tampada");
        }else{
            System.out.println("Estou rabiscando");
        }

    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
