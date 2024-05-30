import java.util.Scanner;

public class MainAkar09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("              Program Menghitung akar");
        System.out.println("====================================================");
        System.out.print("Masukkan bilangan yang ingin dihitung akarnya : ");
        double num = sc09.nextDouble();

        Akar09 akar = new Akar09();
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Hasil akar dengan Divide and Conquer");
        System.out.println("Akar dari " + num + " adalah : " + akar.akarDC(num, 0, num));

        System.out.println("-----------------------------------------------------");
        System.out.println("Hasil akar dengan Brute Force");
        System.out.println("Akar dari " + num + " adalah : " + akar.akarBF(num));
    }
}
