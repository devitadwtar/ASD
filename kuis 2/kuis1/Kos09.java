package kuis1;

public class Kos09 {
    String nomorKamar;
    String namaPenghuni;
    double sewa;

    public Kos09() {
        this.nomorKamar = "";
        this.namaPenghuni = "";
        this.sewa = 0.0;
    }

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

    @Override
    public String toString() {
        return "Kos09{" +
                "nomorKamar='" + nomorKamar + '\'' +
                ", namaPenghuni='" + namaPenghuni + '\'' +
                ", sewa=" + sewa +
                '}';
    }
}
