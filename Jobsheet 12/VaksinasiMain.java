import java.util.Scanner;

public class VaksinasiMain {
    public static void main(String[] args) {
        Vaksinasi09 queue = new Vaksinasi09();
        Scanner sc09 = new Scanner(System.in);
        int choice;

        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("\n1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");

            choice = sc09.nextInt();
            sc09.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Pengantri Vaksin");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Antrian: ");
                    int queueNumber = sc09.nextInt();
                    sc09.nextLine();
                    System.out.println("Nama Penerima: ");
                    String name = sc09.nextLine();
                    queue.enqueue(queueNumber, name);
                    break;
                case 2:
                    queue.dequeue();
                    queue.printQueue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (choice != 4);

        sc09.close();
    }
}
