package kuis1;

import java.util.Scanner;

public class MainKos09 {
    public static void main(String[] args) {
        LinkedListKos09 list = new LinkedListKos09();

        list.tambah(new Kos09("1-3", "April", 600000));
        list.tambah(new Kos09("2-4", "Meisy", 500000));
        list.tambah(new Kos09("2-3", "Devita", 550000));
        list.tambah(new Kos09("3-5", "Shafa", 650000));

        Scanner sc09 = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=====================================");
            System.out.println("         Kos Semanggi Barat 2B        ");
            System.out.println("=====================================");
            System.out.println("Menu:");
            System.out.println("1. Tambah Kamar");
            System.out.println("2. Hapus Kamar");
            System.out.println("3. Cari Kamar Berdasarkan Nomor");
            System.out.println("4. Cari Kamar Berdasarkan Nama");
            System.out.println("5. Cetak Semua Kamar");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc09.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor kamar: ");
                    String nomorKamar = sc09.next();
                    System.out.print("Masukkan nama penghuni: ");
                    String namaPenghuni = sc09.next();
                    System.out.print("Masukkan sewa: ");
                    double sewa = sc09.nextDouble();
                    list.tambah(new Kos09(nomorKamar, namaPenghuni, sewa));
                    break;
                case 2:
                    System.out.print("Masukkan nomor kamar yang akan dihapus: ");
                    nomorKamar = sc09.next();
                    list.hapus(nomorKamar);
                    break;
                case 3:
                    System.out.print("Masukkan nomor kamar yang akan dicari: ");
                    nomorKamar = sc09.next();
                    Kos09 kamar = list.cariBerdasarkanNomor(nomorKamar);
                    if (kamar != null) {
                        System.out.println(formatOutput(kamar));
                    } else {
                        System.out.println("Kamar tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama penghuni yang akan dicari: ");
                    namaPenghuni = sc09.next();
                    Kos09 kamarNama = list.cariBerdasarkanNama(namaPenghuni);
                    if (kamarNama != null) {
                        System.out.println(formatOutput(kamarNama));
                    } else {
                        System.out.println("Kamar tidak ditemukan.");
                    }
                    break;
                case 5:
                    list.cetakSemua();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 6);
    }

    private static String formatOutput(Kos09 kamar) {
        return String.format("| %-12s | %-14s | %.0f |", kamar.getNomorKamar(), kamar.getNamaPenghuni(), kamar.getSewa());
    }
}
