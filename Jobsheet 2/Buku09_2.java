public class Buku09_2 {
    
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    public Buku09_2() {        
    }

    public Buku09_2(String jud, String pg, int hal, int stok, int har) {
        this.judul = jud;
        this.pengarang = pg;
        this.halaman = hal;
        this.stok = stok;
        this.harga = har;
    }

    public void tampilInformasi() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Pengarang: " + this.pengarang);
        System.out.println("Halaman: " + this.halaman);
        System.out.println("Stok: " + this.stok);
        System.out.println("Harga: " + this.harga);
    }

    public void terjual(int jml) {
        this.stok -= jml;
    }

    public void gantiHarga(int har) {
        this.harga = har;
    }

    public static void main(String[] args) {
        Buku09_2 bk1 = new Buku09_2();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku09_2 bk2 = new Buku09_2("Self Reward", "Maheer Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
