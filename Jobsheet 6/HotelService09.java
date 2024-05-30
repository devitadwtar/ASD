public class HotelService09 {
    Hotel09 listHotel[] = new Hotel09[3];
    int idx;
    
    void tambah(Hotel09 z) {
        if (idx < listHotel.length) {
            listHotel[idx] = z;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil() {
        for (Hotel09 z : listHotel) {
            z.tampil();
            System.out.println("---------------------------------");
        }
    }
    
    void bubbleSort() {
        for (int i = 0; i < listHotel.length - 1; i++) {
            for (int j = 1; j < listHotel.length - i; j++) {
                if (listHotel[j].bintang > listHotel[j - 1].bintang) {
                    Hotel09 tmp = listHotel[j];
                    listHotel[j] = listHotel[j - 1];
                    listHotel[j - 1] = tmp;
                }
            }
        }
    }
    
    void bubbleSort2() {
        for (int i = 0; i < listHotel.length - 1; i++) {
            for (int j = 1; j < listHotel.length - i; j++) {
                if (listHotel[j].harga > listHotel[j - 1].harga) {
                    Hotel09 tmp = listHotel[j];
                    listHotel[j] = listHotel[j - 1];
                    listHotel[j - 1] = tmp;
                }
            }
        }
    }
    
    void selectionSort() {
        for (int i = 0; i < listHotel.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listHotel.length; j++) {
                if (listHotel[j].bintang < listHotel[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel09 tmp = listHotel[idxMin];
            listHotel[idxMin] = listHotel[i];
            listHotel[i] = tmp;
        }
    }
    
    void selectionSort2() {
        for(int i = 0; i < listHotel.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j < listHotel.length; j++){
                if(listHotel[j].harga < listHotel[idxMin].harga){
                    idxMin = j;
                }
            }
            //swap
            Hotel09 tmp = listHotel[idxMin];
            listHotel[idxMin] = listHotel[i];
            listHotel[i] = tmp;
        }
    }
}
