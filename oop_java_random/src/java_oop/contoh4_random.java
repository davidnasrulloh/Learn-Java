package java_oop;

class satu{
    String name;
    
    satu(){
        
    }
    
    satu(String name){
        this.name = name;
    }
}

class print{
    public static void in(String pesan){
        System.out.println(pesan);
    }
    
    void show(){
        System.out.println("Hai guysss");
    }
    
//    public static void in(double pesan){
//        System.out.println(pesan);
//    }
}

class out extends print{
//    hampa kosong brooo
    void show(){
        System.out.println("David Nasruloh");
    }
}

class out1 extends print{
    void show(){
        
    }
}
public class contoh4_random {
    public static void main(String[] args) {
        satu coba = new satu("David");
        out gas = new out();
        
        print.in("Hai");
//        print.in(9);

        gas.show();
    }
}
