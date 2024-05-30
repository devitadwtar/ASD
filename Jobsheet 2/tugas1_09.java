public class tugas1_09 {

    String judul, pengarang;
    int halaman, stock, harga;
    int hargaTotal;
    double diskon;
    int hrgaBayar;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Halaman : " + halaman);
        System.out.println("Stock : " + stock);
        System.out.println("Harga : " + harga);
    }

    int terjual(int jml) {
        stock -= jml;
        return jml;
    }

    void restock(int jml) {
        stock += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        hargaTotal = harga * jml;
        System.out.println("Harga total: " + hargaTotal);
        return hargaTotal;
    }

    double hitungDiskon() {
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 0.12; // diskon 12% untuk harga total > 150000
        } else if (hargaTotal >= 75000) {
            diskon = hargaTotal * 0.05; // diskon 5% untuk harga total >= 75000
        } else {
            diskon = 0; // Tidak ada diskon untuk harga total < 75000
        }
        System.out.println("Hitung harga setelah di diskon : " + diskon);
        return diskon;
    }

    double hargaBayar() {
        hrgaBayar = (int) (hargaTotal - diskon); // Harga yang harus dibayar adalah harga total dikurangi diskon
        System.out.println("Harga yang harus di bayar : " + hrgaBayar);
        return hrgaBayar;
    }
}

