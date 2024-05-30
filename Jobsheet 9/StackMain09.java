import java.util.Scanner;

public class StackMain09 {
    public static void main(String[] args) {
    
    StackPakaian09 stk09 = new StackPakaian09(5);
    Scanner sc09 = new Scanner(System.in);

     char pilih;
    
    do{
        System.out.print("Jenis: ");
        String jenis = sc09.nextLine();
        System.out.print("Warna: ");
        String warna = sc09.nextLine();
        System.out.print("Merk: ");
        String merk = sc09.nextLine();
        System.out.print("Ukuran: ");
        String ukuran = sc09.nextLine();
        System.out.print("Harga: ");
        double harga = sc09.nextDouble();

        Pakaian09 p09 = new Pakaian09(jenis, warna, merk, ukuran, harga);
        System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
        pilih = sc09.next().charAt(0);
        sc09.nextLine();
        stk09.push(p09);
    } while (pilih == 'y');

    stk09.getMax();
    stk09.print();
    stk09.pop();
    stk09.peek();
    stk09.print();
    
    }
}
