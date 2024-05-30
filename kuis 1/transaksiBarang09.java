import java.util.ArrayList;

public class transaksiBarang09 {
    private ArrayList<barang09> barangs;

    public transaksiBarang09() {
        this.barangs = new ArrayList<>();
    }

    public void tambahBarang(barang09 barang) {
        this.barangs.add(barang);
    }

    public void tampilkanBarang() {
        System.out.println("=========================");
        System.out.println("      DAFTAR BARANG      ");
        System.out.println("=========================");
        for (barang09 barang : barangs) {
            System.out.println(barang.getKode() + " - " + barang.getNama() + " - " + barang.getHarga() + " - " + barang.getStok());
        }
    }

    public void tampilkanPembelian() {
        System.out.println("=========================");
        System.out.println("     DAFTAR PEMBELIAN    ");
        System.out.println("=========================");
        for (barang09 barang : barangs) {
            System.out.println(barang.getKode() + " - " + barang.getNama() + " - " + barang.getHarga());
        }
    }

    public void pembelian(String kode) {
        barang09 barang = null;
        for (barang09 b : barangs) {
            if (b.getKode().equals(kode)) {
                barang = b;
                break;
            }
        }

        if (barang != null) {
            if (barang.getStok() > 0) {
                barang.setStok(barang.getStok() - 1);
                System.out.println("Pembelian berhasil.");
            } else {
                System.out.println("Stok barang habis.");
            }
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }
}