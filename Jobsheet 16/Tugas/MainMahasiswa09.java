package Tugas;
import java.util.Scanner;

/**
 * MainMahasiswa09
 */
public class MainMahasiswa09 {
    public static void main(String[] args) {
        DataNilai09 ln = new DataNilai09();

        // Input data mahasiswa
        Mahasiswa09 m1 = new Mahasiswa09("20001", "Thalhah", "021xxx");
        Mahasiswa09 m2 = new Mahasiswa09("20002", "Zubair", "021xxx");
        Mahasiswa09 m3 = new Mahasiswa09("20003", "Abdur-Rahman", "021xxx");
        Mahasiswa09 m4 = new Mahasiswa09("20004", "Sa'ad", "021xxx");
        Mahasiswa09 m5 = new Mahasiswa09("20005", "Sa'ad", "021xxx");
        Mahasiswa09 m6 = new Mahasiswa09("20006", "Ubaidah", "021xxx");
        ln.inputDataMahasiswa(m1, m2, m3, m4, m5, m6);

        // Input data mata kuliah
        MataKuliah09 mt09 = new MataKuliah09("00001", "Internet " + "of Things", 3);
        MataKuliah09 mt10 = new MataKuliah09("00002", "Algoritma " + "dan Struktur Data", 2);
        MataKuliah09 mt11 = new MataKuliah09("00003", "Algoritma " + "dan Struktur Data", 2);
        MataKuliah09 mt12 = new MataKuliah09("00004", "Praktikum " + "Algoritma dan Struktur Data", 3);
        MataKuliah09 mt13 = new MataKuliah09("00005", "Praktikum " + "Algoritma dan Pemrograman", 3);
        ln.inputDataMataKuliah(mt09, mt10, mt11, mt12, mt13);

        Scanner sc = new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("************************************************");
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("\n1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Mengahapus data pertama");
            System.out.println("6. Keluar");
            System.out.println("");
            System.out.print("Pilih : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // menu input nilai
                    System.out.println("Masukkan data");
                    System.out.print("Kode : ");
                    String kd = sc.next();
                    System.out.print("Nilai : ");
                    double inputNilai = sc.nextDouble();

                    System.out.println("DAFTAR MAHASISWA");
                    System.out.println("************************************************");
                    System.out.printf("%-10s %-15s %s\n", "NIM", "Nama", "Telp");
                    ln.tampilDataMahasiswa();
                    System.out.print("Pilih mahasiswa by nim: ");
                    String tempNim = sc.next();

                    System.out.println("DAFTAR MATA KULIAH");
                    System.out.println("************************************************");
                    System.out.printf("%-10s %-40s %s\n", "Kode", "Mata Kuliah", "SKS");
                    ln.tampilDataMataKuliah();
                    System.out.print("Pilih MK by kode: ");
                    String tempKd = sc.next();

                    Nilai09 temp = new Nilai09(kd, inputNilai, tempKd, tempNim);
                    ln.inputNilaiMahasiswa(temp);
                    break;

                case 2:
                    // menu menampilkan nilai
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.printf("%-10s %-15s %-40s %-10s %s\n",
                            "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    ln.tampilListNilai();
                    break;

                case 3:
                    // menu untuk mencari nilai mahasiswa
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.printf("%-10s %-15s %-40s %-10s %s\n",
                            "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    ln.tampilListNilai();
                    System.out.print("Masukkan data mahasiswa[nim]: ");
                    String tempNIM = sc.next();
                    int indexSearch = ln.linearSearchNilaiMahasiswa(tempNIM);
                    if (indexSearch != -1) {
                        int indexMatkul = 0;
                        for (int i = 0; i < ln.matkul.size(); i++) {
                            if (ln.listNilai.get(indexSearch).kdMatkul.equals(ln.matkul.get(i).kode)) {
                                indexMatkul = i;
                                break;
                            }
                        }
                        System.out.printf("%-10s %-15s %-40s %-10s %s\n",
                                "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                        System.out.printf("%-10s %-15s %-40s %-10d %.2f\n",
                                ln.mhs.get(ln.linearSearchMHS(tempNIM)).nim,
                                ln.mhs.get(ln.linearSearchMHS(tempNIM)).nama,
                                ln.matkul.get(indexMatkul).namaMatkul,
                                ln.matkul.get(indexMatkul).sks,
                                ln.listNilai.get(indexSearch).nilai);
                        System.out.println("Total SKS " + ln.matkul.get(indexMatkul).sks + " telah diambil");
                    } else {
                        System.out.println("Data mahasiswa dengan NIM " + tempNIM + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    // menu untuk menyorting nilai mahasiswa kecil -> besar
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.printf("%-10s %-15s %-40s %-10s %s\n",
                            "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    ln.sortingData();
                    ln.tampilListNilai();
                    break;

                case 5:
                    // menu untuk menghapus data pertama nilai mahasiswa
                    if (!ln.listNilai.isEmpty()) {
                        System.out.println("Data berhasil dihapus");
                        ln.removeList();
                    } else {
                        System.out.println("Tidak ada data untuk dihapus");
                    }
                    break;

                case 6:
                    // menu untuk keluar
                    isTrue = false;
                    break;

                default:
                    System.out.println("Inputan salah");
            }
        }
        sc.close();
    }
}
