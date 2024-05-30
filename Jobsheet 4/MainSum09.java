import java.util.Scanner;

public class MainSum09 {
  public static void main(String[] args) {
    Scanner sc09 = new Scanner(System.in);

    System.out.print("Masukkan jumlah perusahaan: ");
    int n = sc09.nextInt();

    Sum09[] perusahaan = new Sum09[n];

    for (int i = 0; i < n; i++) {
      System.out.println("========================================================================");
      System.out.println("Data Perusahaan " + (i + 1));

      System.out.print("Masukkan nama perusahaan: ");
      String namaPerusahaan = sc09.next();

      System.out.println("------------------------------------------------------------------------");
      System.out.println("Program Menghitung Keuntungan Total");
      System.out.println("------------------------------------------------------------------------");
      System.out.print("Masukkan jumlah bulan: ");
      int elemen = sc09.nextInt();

      perusahaan[i] = new Sum09(namaPerusahaan, elemen);

      System.out.println("(masukkan keuntungan dalam Satuan Juta, Misal 5.9)");

      for (int j = 0; j < elemen; j++) {
        System.out.print("Masukkan untung bulan ke- " + (j + 1) + " = ");
        perusahaan[i].keuntungan[j] = sc09.nextDouble();
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.println("========================================================================");
      System.out.println("Perusahaan " + perusahaan[i].namaPerusahaan); 
      System.out.println("Algoritma Brute Force");
      System.out.println("Total keuntungan: " + perusahaan[i].totalBF09(perusahaan[i].keuntungan));
      System.out.println("Algoritma Divide Conquer");
      System.out.println("Total keuntungan: " + perusahaan[i].totalDC09(perusahaan[i].keuntungan, 0, perusahaan[i].elemen - 1));
    }
  }
}
