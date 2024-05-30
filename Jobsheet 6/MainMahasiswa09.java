import java.util.Scanner;

public class MainMahasiswa09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        
        DaftarMahasiswaBerprestasi09 list = new DaftarMahasiswaBerprestasi09();
        
        Mahasiswa09 m1 = new Mahasiswa09("Nisa", 2017, 25, 3);
        Mahasiswa09 m2 = new Mahasiswa09("Rara", 2012, 19, 4);
        Mahasiswa09 m3 = new Mahasiswa09("Dompu", 2018, 19, 3.5);
        Mahasiswa09 m4 = new Mahasiswa09("Abdul", 2017, 23, 2);
        Mahasiswa09 m5 = new Mahasiswa09("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
       
        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();
   
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk (Bubble sort) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk (Selection sort) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk (Insertion sort) : ");
        list.insertionSort();
        list.tampil();
   
        sc09.close();
    }
}