import java.util.Scanner;

public class mainBarang09 {
    public static void main(String[] args) {
        transaksiBarang09 transaksiBarang = new transaksiBarang09();

        transaksiBarang.tambahBarang(new barang09("K01", "Sabun", 1000, 5));
        transaksiBarang.tambahBarang(new barang09("K02", "Pasta gigi", 2000, 10));
        transaksiBarang.tambahBarang(new barang09("K03", "Biore", 3000, 23));
        transaksiBarang.tambahBarang(new barang09("K04", "Shampoo", 4000, 55));
        transaksiBarang.tambahBarang(new barang09("K05", "Sikat gigi", 5000, 65));

        // Sistem menu
        Scanner sc09 = new Scanner(System.in);
        while (true) {
            System.out.println("=========================");
            System.out.println(" TOKO MAJU MUNDUR CANTIK ");
            System.out.println("=========================");
            System.out.println("1. Tampilkan barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih (1 - 4): ");

            int pilihan = sc09.nextInt();

            switch (pilihan) {
                case 1:
                    transaksiBarang.tampilkanBarang();
                    break;
                case 2:
                    System.out.print("Masukkan kode barang: ");
                    String kodeBarang = sc09.next();
                    transaksiBarang.pembelian(kodeBarang);
                    System.out.print("Apakah akan belanja kembali (Y/N): ");
                    char belanjaKembali = sc09.next().charAt(0);
                    if (belanjaKembali != 'Y' && belanjaKembali != 'y') {
                        System.out.println("Terima kasih.");
                        return;
                    }
                    break;
                case 3:
                    System.out.println("=========================");
                    System.out.println("     DAFTAR PEMBELIAN    ");
                    System.out.println("=========================");
                    transaksiBarang.tampilkanPembelian();
                    break;
                case 4:
                    System.out.println("Terima kasih.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}