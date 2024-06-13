import java.util.Arrays;
import java.util.Scanner;

public class MainRental09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        BarangRental09[] barangRental09s = new BarangRental09[] {
                new BarangRental09("S 4567 YV", "Honda Beat", "Motor", 2017, 25000),
                new BarangRental09("N 4511 VS", "Honda Vario", "Motor", 2018, 25000),
                new BarangRental09("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 40000),
                new BarangRental09("AB 4321 A", "Toyota Innova", "Mobil", 2019, 40000),
                new BarangRental09("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 40000)
        };
        TransaksiRental09[] transaksiRental09s = new TransaksiRental09[100];
        int jumlahTransaksi = 0;
        int kodeTransaksi = 1;
        boolean running = true;

        while (running) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            int pilihan = sc09.nextInt();
            sc09.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Kendaraan Rental Serba Serbi");
                    System.out.println("===================================================================");
                    System.out.println("| Nomor TNKB | Nama Kendaraan | Jenis | Tahun | Biaya Sewa Perjam |");
                    System.out.println("===================================================================");
                    for (BarangRental09 barangRental : barangRental09s) {
                        System.out.println("| " + barangRental.getNoTNKB() + " | " + barangRental.getNamaKendaraan() + " | " + barangRental.getJenisKendaraan() + " | " + barangRental.getTahun() + " | " + barangRental.getBiayaSewa() + " |");
                    }
                    System.out.println("======================================================");
                    break;

                case 2:
                    System.out.println("Masukkan Data Peminjaman");
                    System.out.print("Masukkan Nama Peminjam: ");
                    String namaPeminjam = sc09.nextLine();
                    System.out.print("Masukkan Nomer TNKB: ");
                    String noTNKB = sc09.nextLine();
                    System.out.print("Masukkan Lama Pinjam (jam): ");
                    int lamaPinjam = sc09.nextInt();
                    sc09.nextLine(); 
                    System.out.print("Apakah Member (ya/tidak): ");
                    String isMember = sc09.nextLine();

                    BarangRental09 barangRental = null;
                    for (BarangRental09 br : barangRental09s) {
                        if (br.getNoTNKB().equals(noTNKB)) {
                            barangRental = br;
                            break;
                        }
                    }
                    if (barangRental == null) {
                        System.out.println("Kendaraan tidak ditemukan.");
                        break;
                    }

                    boolean sudahDipinjam = false;
                    for (TransaksiRental09 transaksi : transaksiRental09s) {
                        if (transaksi != null && transaksi.getBr().getNoTNKB().equals(noTNKB)) {
                            sudahDipinjam = true;
                            break;
                        }
                    }
                    if (sudahDipinjam) {
                        System.out.println("Kendaraan sudah dipinjam oleh orang lain.");
                        break;
                    }

                    int biayaSewa = barangRental.getBiayaSewa();
                    if (barangRental.getJenisKendaraan().equals("Motor")) {
                        biayaSewa = 25000;
                    } else {
                        biayaSewa = 40000;
                    }

                    int totalBiaya = lamaPinjam * biayaSewa;

                    if (lamaPinjam >= 48 && lamaPinjam <= 78) {
                        totalBiaya -= totalBiaya * 0.1;
                    } else if (lamaPinjam > 78) {
                        totalBiaya -= totalBiaya * 0.2;
                    }

                    if (isMember.equalsIgnoreCase("ya")) {
                        totalBiaya -= 25000;
                    }

                    transaksiRental09s[jumlahTransaksi] = new TransaksiRental09(kodeTransaksi, namaPeminjam, lamaPinjam, totalBiaya, barangRental);
                    jumlahTransaksi++;
                    kodeTransaksi++;
                    System.out.println("Transaksi berhasil dibuat.");
                    break;

                case 3:
                    if (jumlahTransaksi == 0) {
                        System.out.println("Belum ada transaksi yang dilakukan.");
                    } else {
                        System.out.println("Daftar Transaksi Peminjaman Rental Serba Serbi");
                        System.out.println("======================================================");
                        System.out.println("| kode | No TNKB | Nama Barang | Nama Peminjam | Lama Pinjam | Total Biaya |");
                        System.out.println("======================================================");
                        for (int i = 0; i < jumlahTransaksi; i++) {
                            TransaksiRental09 transaksi = transaksiRental09s[i];
                            System.out.println("| " + transaksi.getKodeTransaksi() + " | " + transaksi.getBr().getNoTNKB() + " | " + transaksi.getBr().getNamaKendaraan() + " | " + transaksi.getNamaPeminjam() + " | " + transaksi.getLamaPinjam() + " | " + transaksi.getTotalBiaya() + " |");
                        }
                        System.out.println("======================================================");
                    }

                    int totalPendapatan = 0;
                    for (int i = 0; i < jumlahTransaksi; i++) {
                        totalPendapatan += transaksiRental09s[i].getTotalBiaya();
                    }
                    System.out.println("TOTAL PENDAPATAN RENTAL SERBA SERBI");
                    System.out.println("======================================================");
                    System.out.println("Pendapatan hari ini: " + totalPendapatan);
                    break;

                case 4:
                    Arrays.sort(transaksiRental09s, 0, jumlahTransaksi, (t1, t2) -> {
                        char c1 = t1.getNamaPeminjam().toUpperCase().charAt(0);
                        char c2 = t2.getNamaPeminjam().toUpperCase().charAt(0);

                        if (c1 != c2) {
                            return Character.compare(c1, c2);
                        } else {
                            return t2.getBr().getNoTNKB().compareTo(t1.getBr().getNoTNKB());
                        }
                    });

                    System.out.println("Daftar Transaksi Peminjaman Rental Serba Serbi diurutkan:");
                    System.out.println("1. Nama Peminjam A-Z, No TNKB secara descending");
                    System.out.println("======================================================");
                    System.out.println("| kode | No TNKB | Nama Barang | Nama Peminjam | Lama Pinjam | Total Biaya |");
                    System.out.println("======================================================");
                    for (int i = 0; i < jumlahTransaksi; i++) {
                        TransaksiRental09 transaksi = transaksiRental09s[i];
                        System.out.println("| " + transaksi.getKodeTransaksi() + " | " + transaksi.getBr().getNoTNKB() + " | " + transaksi.getBr().getNamaKendaraan() + " | " +
                                transaksi.getNamaPeminjam() + " | " + transaksi.getLamaPinjam() + " | " + transaksi.getTotalBiaya() + " |");
                    }
                    System.out.println("======================================================");

                    int totalPendapatanSorted = 0;
                    for (int i = 0; i < jumlahTransaksi; i++) {
                        totalPendapatanSorted += transaksiRental09s[i].getTotalBiaya();
                    }
                    System.out.println("TOTAL PENDAPATAN RENTAL SERBA SERBI");
                    System.out.println("======================================================");
                    System.out.println("Pendapatan hari ini (setelah sorting): " + totalPendapatanSorted);
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1 sampai 5.");
                    break;
            }
        }
        sc09.close();
    }
}
