import java.util.Scanner;

public class PersegiPanjangDemo09 {
    public static void main(String[]args){
        Scanner sc09 = new Scanner(System.in);

        System.out.print("Masukkan banyak persegi panjang yang anda inginkam: ");
        int lenght = sc09.nextInt();

        PersegiPanjang09[] arrayOfPersegiPanjang09 = new PersegiPanjang09[3];
        int panjang, lebar;

        for (int i = 0; i < lenght; i++){
            System.out.println("Persegi panjang ke- " + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc09.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc09.nextInt();

            arrayOfPersegiPanjang09[i] = new PersegiPanjang09(panjang, lebar);
            System.out.println();
        }  
        for (int i = 0; i < lenght; i++) {
            System.out.println("===================================");
                System.out.println("Persegi panjang ke-"+ (i + 1));
                arrayOfPersegiPanjang09[i].cetakInfo();
                arrayOfPersegiPanjang09[i].hitungLuas();
                arrayOfPersegiPanjang09[i].hitungKeliling();
        }
    }
}
