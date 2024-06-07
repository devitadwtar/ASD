package Tugas;

/**
 * Nilai09
 */
public class Nilai09 {

    double nilai;
    String kode, kdMatkul, nimMhs;

    public Nilai09(String kode, double nilai, String kdMatkul, String nimMhs) {
        this.nilai = nilai;
        this.kode = kode;
        this.kdMatkul = kdMatkul;
        this.nimMhs = nimMhs;
    }

    void tampil() {
        System.out.printf("%.2f", nilai);  // Changed format specifier to match double
    }
}
