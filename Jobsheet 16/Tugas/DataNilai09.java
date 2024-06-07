package Tugas;

import java.util.*;

/**
 * DataNilai09
 */
public class DataNilai09 {

    List<Mahasiswa09> mhs = new ArrayList<>();
    List<MataKuliah09> matkul = new ArrayList<>();
    List<Nilai09> listNilai = new ArrayList<>();
    Queue<Mahasiswa09> mahasiswaQueue = new LinkedList<>();

    // input data Mahasiswa
    public void inputDataMahasiswa(Mahasiswa09... mahasiswas) {
        mhs.addAll(Arrays.asList(mahasiswas));
    }

    // input list nilai mahasiswa
    public void inputNilaiMahasiswa(Nilai09 n) {
        listNilai.add(n);
    }

    // input data Mata Kuliah
    public void inputDataMataKuliah(MataKuliah09... mk) {
        matkul.addAll(Arrays.asList(mk));
    }

    // tampil data Mahasiswa
    public void tampilDataMahasiswa() {
        mhs.stream().forEach(mhs -> {
            mhs.tampil();
        });
    }

    // tampil data Mata Kuliah
    public void tampilDataMataKuliah() {
        matkul.stream().forEach(matkul -> {
            matkul.tampil();
        });
    }

    // tampil list nilai mahasiswa
    public void tampilListNilai() {
        for (int i = 0; i < listNilai.size(); i++) {
            int indexMhs = linearSearchMHS(listNilai.get(i).nimMhs);
            int indexMatkul = linearSearchMatkul(listNilai.get(i).kdMatkul);
            System.out.printf("%-10s %-15s %-40s %-10d %.2f\n",
                    mhs.get(indexMhs).nim, 
                    mhs.get(indexMhs).nama, 
                    matkul.get(indexMatkul).namaMatkul, 
                    matkul.get(indexMatkul).sks, 
                    listNilai.get(i).nilai);
        }
    }

    // mencari nim mahasiswa
    int linearSearchMHS(String nim) {
        for (int i = 0; i < mhs.size(); i++) {
            if (nim.equals(mhs.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    // mencari kode mata kuliah
    int linearSearchMatkul(String kode) {
        for (int i = 0; i < matkul.size(); i++) {
            if (kode.equals(matkul.get(i).kode)) {
                return i;
            }
        }
        return -1;
    }

    // mencari nilai mahasiswa
    int linearSearchNilaiMahasiswa(String nimMahasiswa) {
        for (int i = 0; i < listNilai.size(); i++) {
            if (nimMahasiswa.equals(listNilai.get(i).nimMhs)) {
                return i;
            }
        }
        return -1;
    }

    // sorting data nilai mahasiswa
    public void sortingData() {
        Collections.sort(listNilai, new Comparator<Nilai09>() {
            public int compare(Nilai09 n1, Nilai09 n2) {
                return Double.compare(n1.nilai, n2.nilai);
            }
        });
    }

    // menghapus data pertama sesuai dengan fifo
    public void removeList() {
        if (!mahasiswaQueue.isEmpty()) {
            Mahasiswa09 removedStudent = mahasiswaQueue.poll();
            int index = linearSearchMHS(removedStudent.nim);
            if (index != -1) {
                mhs.remove(index);
                // Also remove associated grade data
                for (int i = listNilai.size() - 1; i >= 0; i--) {
                    if (listNilai.get(i).nimMhs.equals(removedStudent.nim)) {
                        listNilai.remove(i);
                    }
                }
                System.out.println("Data mahasiswa dengan NIM " + removedStudent.nim + " telah dihapus.");
            } else {
                System.out.println("Data mahasiswa dengan NIM " + removedStudent.nim + " tidak ditemukan.");
            }
        } else {
            System.out.println("Antrian penghapusan kosong.");
        }
    }

    // tambahkan data mahasiswa ke antrian penghapusan
    public void enqueueDeletion(Mahasiswa09 mahasiswa) {
        mahasiswaQueue.offer(mahasiswa);
    }

    // metode untuk mengeluarkan mahasiswa dari antrian penghapusan
    public Mahasiswa09 dequeueDeletion() {
        return mahasiswaQueue.poll();
    }
}
