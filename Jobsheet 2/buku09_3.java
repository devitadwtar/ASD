public class buku09_3 {
    
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    public buku09_3() {        
    }

    public buku09_3(String jud, String pg, int hal, int stok, int har) {
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
        if (jml <= this.stok) {
            this.stok -= jml;
            System.out.println(jml + " buku terjual.");
        } else {
            System.out.println("Stok tidak mencukupi untuk menjual " + jml + " buku.");
        }
    }

    public void gantiHarga(int har) {
        this.harga = har;
        System.out.println("Harga berhasil diubah menjadi " + this.harga);
    }

    public static void main(String[] args) {
        buku09_3 bk1 = new buku09_3();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        buku09_3 bk2 = new buku09_3("Self Reward", "Maheer Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        buku09_3 bukuDevita = new buku09_3("Cara Memancing", "Devita Dwi Lestari", 150, 100, 99000);
        bukuDevita.tampilInformasi(); 
    }
}
