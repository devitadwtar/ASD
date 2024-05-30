import java.util.Scanner;

public class MainFaktorial09 {

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc09.nextInt();
    
        Faktorial09[] fk09 = new Faktorial09[elemen];
        for (int i = 0; i < elemen; i++){
            fk09[i] = new Faktorial09();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk09[i].nilai = sc09.nextInt();
        }
        
        System.out.println("=================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long startTime = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk09[i].nilai + " adalah : " + fk09[i].faktorialBF09(fk09[i].nilai));
        }
        long endTime = System.nanoTime();
        double timeTakenBF = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Waktu eksekusi Brute Force: " + timeTakenBF + " seconds");
        
        startTime = System.nanoTime();
        System.out.println("=================================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk09[i].nilai + " adalah : " + fk09[i].faktorialDC09(fk09[i].nilai));
        }
        endTime = System.nanoTime();
        double timeTakenDC = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Waktu eksekusi Divide and Conquer: " + timeTakenDC + " seconds");
        System.out.println("=================================================");

    }
}
