public class Transaksi09 {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;

    public Transaksi09(int saldo, int saldoAwal, int saldoAkhir, String tanggalTransaksi, String type) {
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
       
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoAwal() {
        return saldoAwal;
    }

    public double getSaldoAkhir() {
        return saldoAkhir;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public String getType() {
        return type;
    }

    void tampil(){
        System.out.println("Saldo \t Saldo awal \t Akhir \t Tanggal transaksi \t Type");
        System.out.println(saldo + '\t' + saldoAwal + '\t' + saldoAkhir + '\t' + tanggalTransaksi + '\t' + type);
    }
}