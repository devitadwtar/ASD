import java.util.Scanner;

public class fungsi09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        //Informasi jumlah setiap bunga pada semua cabang telah tersimpan di array
        String[] namaCabang = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        // Menampilkan pendapatan
        System.out.println("\nPendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = hitungPendapatan(stokBunga[i], hargaBunga);
            System.out.println(namaCabang[i] + ": " + pendapatan);
        }
        // Menampilkan pengurangan jumlah stok
        System.out.println("\nJumlah stok setiap jenis bunga pada cabang Royal Garden 4 setelah pengurangan:");
        int[] stokSetelahPengurangan = hitungStokSetelahPengurangan(stokBunga[3]);
        for (int i = 0; i < stokSetelahPengurangan.length; i++) {
            System.out.println(namaBunga(i) + ": " + stokSetelahPengurangan[i]);
        }
    }
    // Menghitung pendapatan semua bunga pada setiap cabang
    public static int hitungPendapatan(int[] stokBunga, int[] hargaBunga) {
        int pendapatan = 0;
        for (int i = 0; i < stokBunga.length; i++) {
            pendapatan += stokBunga[i] * hargaBunga[i];
        }
        return pendapatan;
    }
    // Menghitung pengurangan stok bunga pada cabang royal garden 4
    public static int[] hitungStokSetelahPengurangan(int[] stokBunga) {
        int[] stokSetelahPengurangan = new int[stokBunga.length];
        for (int i = 0; i < stokBunga.length; i++) {
            stokSetelahPengurangan[i] = stokBunga[i] - hitungPenguranganStok(namaBunga(i));
        }
        return stokSetelahPengurangan;
    }
    // Memanggil kembali fungsi hitung pengurangan
    public static int hitungPenguranganStok(String jenisBunga) {
        switch (jenisBunga) {
            case "Aglonema":
                return 1;
            case "Keladi":
                return 2;
            case "Alocasia":
                return 0;
            case "Mawar":
                return 5;
            default:
                return 0;
        }
    }
    // Memanggil kembali fungsi nama bunga
    private static String namaBunga(int jenisBunga) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        return namaBunga[jenisBunga];
    }
}