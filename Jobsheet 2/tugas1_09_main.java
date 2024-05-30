public class tugas1_09_main {
    public static void main(String[] args) {
        tugas1_09 bk1 = new tugas1_09();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stock = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon();
        bk1.hargaBayar();
    }
}
