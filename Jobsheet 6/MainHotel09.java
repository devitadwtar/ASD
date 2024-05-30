import java.util.Scanner;

public class MainHotel09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        
        HotelService09 list = new HotelService09();
        
        Hotel09 h1 = new Hotel09("Treasure", "Sidoarjo", 1500000, (byte) 5);
        Hotel09 h2 = new Hotel09("Neo City", "Malang", 2000000, (byte) 3);
        Hotel09 h3 = new Hotel09("Wanna one", "Surabaya", 1300000, (byte) 4);
      
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);   
       
        System.out.println("Data hotel sebelum sorting:");
        list.tampil();

        System.out.println("======================================================");

        System.out.println("Data hotel setelah sorting desc berdasarkan bintang:");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data hotel setelah sorting desc berdasarkan harga:");
        list.bubbleSort2();
        list.tampil();

        System.out.println("=====================================================");

        System.out.println("Data hotel setelah sorting desc berdasarkan bintang:");
        list.selectionSort();
        list.tampil();

        System.out.println("Data hotel setelah sorting desc berdasarkan harga:");
        list.selectionSort2();
        list.tampil();
   
        sc09.close();
    }
}
