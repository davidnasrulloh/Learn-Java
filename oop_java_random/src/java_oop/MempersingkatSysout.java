package java_oop;

// contoh
// mempersingkat tulisan sysout 
// NB: Jika beda package maka harus dilakukan import terlebih dahulu

class class_Print{
    public static void ln(String pesan){
        System.out.println(pesan);
    }
    
    public static void ln(double pesan){
        System.out.println(pesan);
    }
}

public class MempersingkatSysout {
    public static void main(String[] args) {
        String nama = "David Nasrulloh";
        int a = 10;
        
        class_Print.ln("Hai " + nama + " " + a);
        class_Print.ln("Angka : " + a);
        class_Print.ln( 10 + a);
    }
}
