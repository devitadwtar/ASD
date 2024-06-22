package kuis1;

import java.util.Scanner;

public class LinkedListKos09 {
    NodeKos09 head;

    public LinkedListKos09() {
        head = null;
    }

    public void tambah(Kos09 data) {
        NodeKos09 newNode = new NodeKos09(data);
        if (head == null) {
            head = newNode;
        } else {
            NodeKos09 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        sortList();
    }

    public void hapus(String nomorKamar) {
        if (head == null) {
            return;
        }
        if (head.data.getNomorKamar().equals(nomorKamar)) {
            head = head.next;
            return;
        }
        NodeKos09 current = head;
        while (current.next != null && !current.next.data.getNomorKamar().equals(nomorKamar)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public Kos09 cariBerdasarkanNomor(String nomorKamar) {
        NodeKos09 current = head;
        while (current != null) {
            if (current.data.getNomorKamar().equals(nomorKamar)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public Kos09 cariBerdasarkanNama(String namaPenghuni) {
        NodeKos09 current = head;
        while (current != null) {
            if (current.data.getNamaPenghuni().equalsIgnoreCase(namaPenghuni)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void cetakSemua() {
        System.out.println("--------------------------------------------");
        System.out.println("Nomor Kamar | Nama Penghuni | Sewa");
        System.out.println("--------------------------------------------");
        NodeKos09 current = head;
        while (current != null) {
            System.out.printf("%-12s | %-14s | %.0f%n",
                    current.data.getNomorKamar(), current.data.getNamaPenghuni(), current.data.getSewa());
            current = current.next;
        }
        System.out.println("--------------------------------------------");
    }

    private void sortList() {
        if (head == null) {
            return;
        }

        NodeKos09 current = head;
        NodeKos09 index = null;
        Kos09 temp;

        while (current != null) {
            index = current.next;

            while (index != null) {
                if (current.data.getNomorKamar().compareTo(index.data.getNomorKamar()) > 0) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
}
