package java_oop;

// penerapan inheritance

class Pegawai{
    // atribut member atau atribut class
    String name;
    String NIK;
    String Alamat;
    
    Pegawai(String name, String NIK, String Alamat){
        this.name = name;
        this.NIK = NIK;
        this.Alamat = Alamat;
    }
    void show(){
        System.out.println("nama : " + this.name);
        System.out.println("NIK : " + this.NIK);
        System.out.println("Alamat : " + this.Alamat + "\n");
    }
    
    public String getNIK(){
        return this.NIK;
    }

}

class PakBun extends Pegawai{
    // mewariskan method dan atribut
    PakBun(String name, String NIK, String Alamat){
        super(name, NIK, Alamat);
    }
    
    void show(){
        System.out.println("nama : " + this.name);
        System.out.println("NIK : " + this.NIK);
        System.out.println("Alamat : " + this.Alamat);
        System.out.println("Status : Kontrak \n");
    }
    
}


public class Contoh1 {
    public static void main(String[] args) {
        Pegawai peg1 = new Pegawai("Hidayat", "19044110006666", "Ntah gk ngerti");
        PakBun bun1 = new PakBun("Isi sendiri", "19033101209102", "Indonesia");
        
        peg1.show();
        bun1.show();
        
    }
}
