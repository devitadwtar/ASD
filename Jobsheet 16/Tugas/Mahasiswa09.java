package Tugas;

/**
 * Mahasiswa09
 */
public class Mahasiswa09 {

    String nim, nama, telf;
    
    public Mahasiswa09(String nim, String nama, String telf) {
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }
    
    void tampil() {
        System.out.printf("%-10s %-15s %s", nim, nama, telf);
        System.out.println("");
    }
}
