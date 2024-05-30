import java.util.Scanner;

public class mahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        mahasiswa09[] arrayOfmahasiswa09 = new mahasiswa09[3];

        double total,rataRata;
        
    for (int i = 0; i < 3; i++) {
        arrayOfmahasiswa09[i] = new mahasiswa09();
        System.out.println();
        System.out.println("Masukkan data mahasiswa ke-" + (i+1));
        System.out.print("Masukkan nama mahasiswa: ");
        arrayOfmahasiswa09[i].nama = sc09.nextLine();
        System.out.print("Masukkan nim mahasiswa: ");
        arrayOfmahasiswa09[i].nim = sc09.nextInt();
        System.out.print("Masukkan jenis kelamin Mahasiswa: ");
        arrayOfmahasiswa09[i].jenisKelamin = sc09.next();
        System.out.print("Masukkan Ipk Mahasiswa: ");
        arrayOfmahasiswa09[i].Ipk = sc09.nextDouble();

        sc09.nextLine();

        }
        System.out.println();
        System.out.println();

    for (int i = 0; i < 3; i++) {
        System.out.println();
        System.out.println("Mahasiswa ke-" + (i+1));
        System.out.println("Nama: " + arrayOfmahasiswa09[i].nama);
        System.out.println("Nim: " + arrayOfmahasiswa09[i].nim);
        System.out.println("Jenis kelamin: " + arrayOfmahasiswa09[i].jenisKelamin);
        System.out.println("Ipk: " + arrayOfmahasiswa09[i].Ipk);

    }
    total = 0;
    for (int i = 0; i < arrayOfmahasiswa09.length; i++) {
    total = total+ arrayOfmahasiswa09[i].Ipk;
    }
    rataRata = total / arrayOfmahasiswa09.length;

    System.out.println();
    System.out.println("Rata-rata IPK Mahasiswa: " + rataRata);
        }
    }

