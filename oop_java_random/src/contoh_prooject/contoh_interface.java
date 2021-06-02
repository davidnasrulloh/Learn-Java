package contoh_prooject;


interface DaftarMenu{
    public void daftarMinumanKopi();
    public void daftarMinumanNonKopi();
}
interface NamaCaffe {
    public void namaCaffe();
    public void alamatCaffe();
}

class DetailMenu implements NamaCaffe, DaftarMenu {
    public void namaCaffe(){
        System.out.println("===Caffe Sejuta Kenangan===");
    }
    public void alamatCaffe(){
        System.out.println("Jalan In Aja Dulu Siapa Tau k.174 Cocok\n");
    }
    public void daftarMinumanKopi(){
        System.out.println("Menu Minuman Kopi --");
        System.out.println("Es Susu Kopi Rp. 18.000");
        System.out.println("Es Susu Pokat Rp. 20.000");
        System.out.println("Es Coco Presso Rp. 18.000");
        System.out.println("Es Kopi Hitam Rp. 15.000\n");
    }
    public void daftarMinumanNonKopi(){
        System.out.println("Menu Minuman Non Kopi --");
        System.out.println("Es Susu Matcha Rp. 18.000");
        System.out.println("Es Yoghurt Yuzu Rp. 28.000");
        System.out.println("Es Susu Soklat Rp. 18.000");
        System.out.println("Es Susu Cincau Rp. 20.000");
    }

}

public class contoh_interface {
    public static void main(String[] args) {
        DetailMenu menu = new DetailMenu();
        menu.namaCaffe();
        menu.alamatCaffe();
        menu.daftarMinumanKopi();
        menu.daftarMinumanNonKopi();
    }
}
