/**
 * buku09
 */
public class buku09 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }
    void terjual(int jml) {
         if (stok > 0) {
            if (jml <= stok) {
                stok -= jml;
                 System.out.println(jml + " buku terjual.");
             } else {
                 System.out.println("Stok tidak mencukupi untuk terjual sebanyak " + jml + " buku.");
             }
         } else {
             System.out.println("Stok buku sudah habis.");
         }
        
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
}