package java_oop;

// inheritance menurunkan atribut class, method dan kecuali constructor 

class Pegawai{
    // atribut class
    String name;
    String NIK;
    
    // Object atribut
    Datagaji datagaji;
    
    Pegawai(String name, String NIK){
        this.name = name;
        this.NIK = NIK;
    }
    
    void setDatagaji(Datagaji datagaji){
        this.datagaji = datagaji;
    }
    
    void display(){
        System.out.println("Nama : " + this.name);
        System.out.println("NIK : " + this.NIK);
        this.datagaji.show();
    }
         
}

class Datagaji {
    int tunjangan;
    int gajipokok;
    int ceperan;
    String jabatan;
    
    Datagaji(String jabatan, int tunjangan, int gajipokok, int ceperan){
        this.tunjangan = tunjangan;
        this.gajipokok = gajipokok;
        this.ceperan = ceperan;
        this.jabatan = jabatan;
    }
    
    void show(){
        System.out.println("Jabatan : " + this.jabatan);
        System.out.println("Tunjangan : " + this.tunjangan);
        System.out.println("Ceperan : " + this.ceperan);
        System.out.println("Gaji Pokok : " + this.gajipokok);
    }
}    


public class program_oop_sederhana {
    public static void main(String[] args) {

         
        Pegawai david = new Pegawai("David Nasrulloh", "190441100060");
        Pegawai naufal = new Pegawai("Naufal Khoiri", "190441100060");
        Pegawai jauhari = new Pegawai("Jauhari", "190441100060");
        
        Datagaji direktur = new Datagaji("Direktur", 2000, 1000, 3000);
        Datagaji manajer = new Datagaji("Manager", 2000, 1000, 3000);
        Datagaji mentri = new Datagaji("Mentri", 2000, 1000, 3000);
        
        // Print.ln diambil dari kelas Print.java
        class_Print.ln("");
        class_Print.ln("Ini hasilnya");
        class_Print.ln("==============");
        jauhari.setDatagaji(direktur);
        jauhari.display();
    }
}
