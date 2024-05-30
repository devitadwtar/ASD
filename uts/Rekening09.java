public class Rekening09 {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;

    public Rekening09(String noRekening, String nama, String namaIbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    void tampil(){
        System.out.println("No rekening \t Nama \t Nama ibu \t Phone \t Email \t");
        System.out.println(noRekening + '\t' + nama + '\t' + namaIbu + '\t' + email);
    }
}