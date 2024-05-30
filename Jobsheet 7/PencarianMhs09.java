/**
 * PencarianMhs09
 */
public class PencarianMhs09 {

    Mahasiswa09 listMhs[];
    int idx;

    PencarianMhs09(int size) {
        listMhs = new Mahasiswa09[size];
        idx = 0;
    }

    void tambah(Mahasiswa09 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for(int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("=====================");
        }
    }

    public int FindSeqSearch (String cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listMhs[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(String cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right)/2;
            if (listMhs[mid].nama.compareToIgnoreCase(cari) == 0) { // Pencarian berdasarkan nama
                return mid;
            } else if (listMhs[mid].nama.compareToIgnoreCase(cari) > 0){
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void TampilPosisi (String x, int pos) {
        if (pos != -1) {
            int count = 1;
            while ((pos - count) >= 0 && listMhs[pos - count].nama.equalsIgnoreCase(x)) {
                count++;
            }
            while ((pos + count) < idx && listMhs[pos + count].nama.equalsIgnoreCase(x)) {
                count++;
            }
            if (count > 1) {
                System.out.println("Data " + x + " ditemukan lebih dari satu kali!"); // data ditemukan lebih dari 1
            } else {
                System.out.println("Data " + x + " ditemukan pada indeks " + pos);
            }
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilData (String x, int pos) {
        if (pos != -1) {
            System.out.println("Nama\t : " + x);
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + " tidak ditemukan ");
        }
    }
}
