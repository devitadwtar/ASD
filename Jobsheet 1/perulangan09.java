import java.util.Scanner;

public class perulangan09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.print("Masukkan NIM: "); // Menginputkan NIM
        String nim = sc09.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2)); // Mengambil 2 angka terakhir dari NIM

        if (n < 10) { //enambahkan 10 ke nilai n jika nilai kurang dari 10
            n += 10;
        }

        System.out.println("----------------------------------");
        System.out.println("n: " + n); // Menampilkan jumlah nilai n
        System.out.println("----------------------------------");
        System.out.print("Hasil: ");
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) { // Mengabaikan angka 6 dan 10
                if (i % 2 == 0) { // Jika angka genap
                    System.out.print(i + " ");
                } else { // Jika angka ganjil
                    System.out.print("* ");
                }
            }
        }
    }
}