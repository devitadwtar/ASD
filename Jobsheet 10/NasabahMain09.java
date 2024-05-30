import java.util.Scanner;

public class NasabahMain09 {
    public static void menu() {
        System.out.println("-----------------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc09.nextInt();
        QueueNb09 antri = new QueueNb09(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc09.nextInt();
            sc09.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc09.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc09.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc09.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc09.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc09.nextDouble();
                    Nasabah09 nb = new Nasabah09(norek, nama, alamat, umur, saldo);
                    sc09.nextLine();
                    antri.enqueue(nb);
                    break;

                case 2:
                    Nasabah09 data = antri.dequeue();
                    if (!data.norek.isEmpty() && !data.nama.isEmpty() && !data.alamat.isEmpty()
                            && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama
                                + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    }
                    break;

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;

                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);

        sc09.close();
    }
}
