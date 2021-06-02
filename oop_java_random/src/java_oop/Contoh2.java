package java_oop;
// penerapan abstract
// sama halnya dengan class tapi tidak bisa di instansiasi
// tapi bisa di turunkan 

interface SiswaIndo{
    void task();
}

abstract class Siswa{
    String name = "David";
    
    abstract void show();
    
    void displayName(){
        System.out.println("nama : " + this.name);
    }
}

class SiswaSD extends Siswa implements SiswaIndo{
    void show(){
        System.out.println("iya ini aku");
    }
    
    @Override
    public void task(){
        System.out.println("belajar");
    }
}

public class Contoh2 {
    public static void main(String[] args) {
           SiswaSD sis1 = new SiswaSD();
           sis1.displayName();
           sis1.show();
           sis1.task();
    }
}
