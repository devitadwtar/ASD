import java.util.Scanner;

public class MainMahasiswa09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = s.nextInt();
        
        PencarianMhs09 data = new PencarianMhs09(jumMhs);

        System.out.println("====================================================");
        System.out.println("Data Keseluruhan Mahasiswa : " + jumMhs);
        data.tampil();

        System.out.println("======================================================");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil : ");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("====================================================");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama =  sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa09 m = new Mahasiswa09(nim, nama, umur, ipk);
            data.tambah(m);
        }
            System.out.println("====================================================");
            System.out.println("Data Keseluruhan Mahasiswa : ");
            data.tampil();

            System.out.println("===========================================");
            System.out.println("===========================================");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan Nama Mahasiswa yang dicari: "); // Diubah menjadi menncari nama
            System.out.print("Nama: ");
            String cari = sl.nextLine();
            System.out.println("Menggunakan binary Search");
            int posisi = data.FindBinarySearch(cari, 0, jumMhs -1);
            data.TampilPosisi(cari, posisi);
            data.TampilData(cari, posisi);
        }
    
}
