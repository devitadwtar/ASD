import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) {
        Film09 list = new Film09();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("==================================");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Judul Film: ");
                    String title1 = scanner.nextLine();
                    System.out.print("Rating Film: ");
                    double rating1 = scanner.nextDouble();
                    list.addFirst(id1, title1, rating1);
                    break;
                case 2:
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.print("ID Film: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Judul Film: ");
                    String title2 = scanner.nextLine();
                    System.out.print("Rating Film: ");
                    double rating2 = scanner.nextDouble();
                    list.addLast(id2, title2, rating2);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.print("ID Film: ");
                    int id3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Judul Film: ");
                    String title3 = scanner.nextLine();
                    System.out.print("Rating Film: ");
                    double rating3 = scanner.nextDouble();
                    System.out.print("Data Film ini akan masuk di urutan ke-");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    list.addAtIndex(id3, title3, rating3, index);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan Index: ");
                    int indexToRemove = scanner.nextInt();
                    list.removeAtIndex(indexToRemove);
                    break;
                case 7:
                    list.printList();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int searchId = scanner.nextInt();
                    list.searchByID(searchId);
                    break;
                case 9:
                    list.sortByRatingDesc();
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (choice != 10);

        scanner.close();
    }
}