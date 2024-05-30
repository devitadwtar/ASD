import java.util.Scanner;

public class MainPangkat09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc09.nextInt();

        Pangkat09[] png09 = new Pangkat09[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc09.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = sc09.nextInt();
            png09[i] = new Pangkat09(nilai, pangkat); 
        }

        System.out.println("==============================================");
        System.out.println("Pilih metode perhitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan Anda (1/2): ");
        int pilihan = sc09.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png09[i].nilai + " pangkat " + png09[i].pangkat + " adalah : " + png09[i].pangkatBF09(png09[i].nilai, png09[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil Pangkat dengan Devide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png09[i].nilai + " pangkat " + png09[i].pangkat + " adalah : " + png09[i].pangkatDC09(png09[i].nilai, png09[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        System.out.println("==============================================");
    }
}
