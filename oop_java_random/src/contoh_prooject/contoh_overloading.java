package contoh_prooject;

// penerapan overloading pada oop

class Main{
    static int sumNumber(int a, int b){
        return a+b;
    }
    static double sumNumber(double a, double b){
        return a+b;
    }
    static double sumNumber(int a, double b){
        return a+b;
    }
    static double sumNumber(double a, int b){
        return a+b;
    }
    
}
public class contoh_overloading {
    public static void main(String[] args) {
        System.out.println("Penjumlahan integer dan integer : "+Main.sumNumber(3,5));
        System.out.println("Penjumlahan double dan double : "+Main.sumNumber(4.7,9.9));
        System.out.println("Penjumlahan integer dan double : "+Main.sumNumber(5,5.9));
        System.out.println("Penjumlahan double dan integer : "+Main.sumNumber(4.3,8));
    }
}


