public class DaftarMahasiswaBerprestasi09 {
    Mahasiswa09 ListMhs[] = new Mahasiswa09[5];
    int idx;

    void tambah (Mahasiswa09 m){
        if(idx<ListMhs.length){
            ListMhs[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for(Mahasiswa09 m : ListMhs){
            m.tampil();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort(){
        for(int i = 0; i<ListMhs.length-1; i++){
            for(int j=1; j<ListMhs.length-i; j++){
                if(ListMhs[j].ipk>ListMhs[j-1].ipk){
                    Mahasiswa09 tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j-1];
                    ListMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i<ListMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<ListMhs.length; j++){
                if(ListMhs[j].ipk < ListMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa09 tmp = ListMhs[idxMin];
            ListMhs[idxMin] = ListMhs[i];
            ListMhs[i] = tmp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < ListMhs.length; i++) {
            Mahasiswa09 temp = ListMhs[i];
            int j = i;
            while (j > 0 && ListMhs[j-1].ipk < temp.ipk) { // Perubahan dilakukan di sini > diubah menjadi <)
                ListMhs[j] = ListMhs[j-1];
                j--;
            }
            ListMhs[j] = temp;
        }
    }    
}
