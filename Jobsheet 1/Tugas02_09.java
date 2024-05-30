import java.util.Scanner;

public class Tugas02_09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Pilih perhitungan: ");
        System.out.println("====================================");
        System.out.println("1. Kecepatan (v)");
        System.out.println("2. Jarak (s)");
        System.out.println("3. Waktu (t)");
        System.out.print("Masukkan pilihan (masukkan angka): ");
        int choice = sc09.nextInt();

        switch (choice) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    public static void hitungKecepatan() {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Anda memilih menghitung kecepatan (v)");
        System.out.println("-----------------------------------");

        System.out.print("Masukkan jarak (dalam Kilo Meter): ");
        double jarak = sc09.nextDouble();

        System.out.print("Masukkan waktu (dalam jam): ");
        double waktu = sc09.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.println("Kecepatan yang dijalankan: " + kecepatan + " KM/Jam");
    }

    public static void hitungJarak() {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Anda memilih menghitung jarak (s)");
        System.out.println("-----------------------------------");

        System.out.print("Masukkan kecepatan (dalam KM/jam): ");
        double kecepatan = sc09.nextDouble();

        System.out.print("Masukkan waktu (dalam jam): ");
        double waktu = sc09.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak yang di tempuh: " + jarak + " KM");
    }

    public static void hitungWaktu() {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Anda memilih menghitung waktu (t)");
        System.out.println("-----------------------------------");

        System.out.print("Masukkan jarak (dalam KM): ");
        double jarak = sc09.nextDouble();

        System.out.print("Masukkan kecepatan (dalam KM/jam): ");
        double kecepatan = sc09.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("Waktu yang dibutuhkan: " + waktu + " jam");
    }
}