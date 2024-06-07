import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa09 {
    List<Mahasiswa09> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa09... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa09 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    public int binarySearch(String nim) {
        List<String> nimList = new ArrayList<>();
        for (Mahasiswa09 mhs : mahasiswas) {
            nimList.add(mhs.nim);
        }
        Collections.sort(nimList);
        return Collections.binarySearch(nimList, nim);
    }

    public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(mhs -> mhs.nim));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, Comparator.comparing((Mahasiswa09 mhs) -> mhs.nim).reversed());
    }

    public static void main(String[] args) {
        ListMahasiswa09 lm = new ListMahasiswa09();
        Mahasiswa09 m = new Mahasiswa09("201234", "Noureen", "021xx1");
        Mahasiswa09 m1 = new Mahasiswa09("201235", "Akhleema", "021xx2");
        Mahasiswa09 m2 = new Mahasiswa09("201236", "Shannum", "021xx3");

        // menambah objek mahasiswa
        lm.tambah(m, m1, m2);

        // menampilkan data mahasiswa
        System.out.println("Data Mahasiswa sebelum diurutkan:");
        lm.tampil();

        // melakukan pengurutan secara ascending
        lm.sortAscending();
        System.out.println("\nData Mahasiswa setelah diurutkan secara ascending:");
        lm.tampil();

        // melakukan pengurutan secara descending
        lm.sortDescending();
        System.out.println("\nData Mahasiswa setelah diurutkan secara descending:");
        lm.tampil();
    }
}
