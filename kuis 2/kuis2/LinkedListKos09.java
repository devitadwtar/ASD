package kuis2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedListKos09 {
    private List<Kos09> kosList;

    public LinkedListKos09() {
        kosList = new ArrayList<>();
    }

    public void tambah(Kos09 data) {
        kosList.add(data);
        sortList();
    }

    public void hapus(String nomorKamar) {
        kosList.removeIf(kos -> kos.getNomorKamar().equals(nomorKamar));
    }

    public Kos09 cariBerdasarkanNomor(String nomorKamar) {
        for (Kos09 kos : kosList) {
            if (kos.getNomorKamar().equals(nomorKamar)) {
                return kos;
            }
        }
        return null;
    }

    public Kos09 cariBerdasarkanNama(String namaPenghuni) {
        for (Kos09 kos : kosList) {
            if (kos.getNamaPenghuni().equalsIgnoreCase(namaPenghuni)) {
                return kos;
            }
        }
        return null;
    }

    public void cetakSemua() {
        System.out.println("--------------------------------------------");
        System.out.println("Nomor Kamar | Nama Penghuni | Sewa");
        System.out.println("--------------------------------------------");
        for (Kos09 kos : kosList) {
            System.out.printf("| %-12s | %-14s | %-6.0f |\n", kos.getNomorKamar(), kos.getNamaPenghuni(), kos.getSewa());
        }
        System.out.println("--------------------------------------------");
    }

    private void sortList() {
        Collections.sort(kosList, (kos1, kos2) -> kos1.getNomorKamar().compareTo(kos2.getNomorKamar()));
    }
}
