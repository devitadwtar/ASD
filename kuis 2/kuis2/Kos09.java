package kuis2;

public class Kos09 {
    private String nomorKamar;
    private String namaPenghuni;
    private double sewa;

    public Kos09(String nomorKamar, String namaPenghuni, double sewa) {
        this.nomorKamar = nomorKamar;
        this.namaPenghuni = namaPenghuni;
        this.sewa = sewa;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getNamaPenghuni() {
        return namaPenghuni;
    }

    public double getSewa() {
        return sewa;
    }
}
