package java_oop;

// penerapan constructor

class Lingkaran{
    private double diameter;
    
    
    Lingkaran(double diameter){
        this.diameter = diameter;
    }
    
    void setJari(double jari2){
        this.diameter = jari2*2;
    }
    
    double getDiamater(){
        return this.diameter;
    }
}
public class Contoh3 {
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran(5.0);
        System.out.println("Diamater : " + ling.getDiamater());
        
        ling.setJari(8.0);
        System.out.println("Diamater : " + ling.getDiamater());
    

    }
}
