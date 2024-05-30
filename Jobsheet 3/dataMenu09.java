import java.util.Scanner;

public class dataMenu09 {

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        Menu[] arrayOfMenu = new Menu[3];

        for (int i = 0; i < arrayOfMenu.length; i++) {
            arrayOfMenu[i] = new Menu();

            System.out.println();
            System.out.println("Masukkan data menu ke-" + (i + 1));
            System.out.print("Masukkan nama menu: ");
            arrayOfMenu[i].namaMenu = sc09.nextLine();
            System.out.print("Masukkan jenis makanan: ");
            arrayOfMenu[i].jenisMakanan = sc09.nextLine();
            System.out.print("Masukkan harga: ");
            arrayOfMenu[i].harga = sc09.nextDouble();

            sc09.nextLine(); 
        }

        dataMenuDemo09.tampilkanDataMenu(arrayOfMenu);
    }
}

class Menu {
    String namaMenu;
    String jenisMakanan;
    double harga;

    void tampilkanMenu() {
        System.out.println();
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Jenis Makanan: " + jenisMakanan);
        System.out.println("Harga: " + harga);
        System.out.println();
    }
}