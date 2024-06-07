public class Graph09 {
    int vertex;
    DoubleLinkedList09 list[];

    public Graph09(int v) {
        vertex = v;
        list = new DoubleLinkedList09[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList09();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;

        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        }

        totalOut = list[asal].size();

        System.out.println("InDegree dari Gedung " + (char)('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char)('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char)('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        // Menghapus edge dari node 'asal' ke node 'tujuan'
        list[asal].remove(tujuan);
        // Menghapus edge dari node 'tujuan' ke node 'asal'
        list[tujuan].remove(asal);
    }
    

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char)('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char)('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println();
            }
        }
        System.out.println("");
    }

     //Modifikasi
     public boolean jikaBenar(int asal, int tujuan) throws Exception {
        for(int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }
}
