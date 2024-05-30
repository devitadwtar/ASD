import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainTransaksi09 {
    public static void main(String[] args) {
        List<Rekening09> daftarRekening = new ArrayList<>();
        List<Transaksi09> daftarTransaksi = new ArrayList<>();

        daftarRekening.add(new Rekening09("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"));
        daftarRekening.add(new Rekening09("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"));
        daftarRekening.add(new Rekening09("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org"));
        daftarRekening.add(new Rekening09("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca"));
        daftarRekening.add(new Rekening09("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"));
        daftarRekening.add(new Rekening09("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca"));
        daftarRekening.add(new Rekening09("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca"));
        daftarRekening.add(new Rekening09("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"));
        daftarRekening.add(new Rekening09("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"));
        daftarRekening.add(new Rekening09("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"));
        daftarRekening.add(new Rekening09("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"));
        daftarRekening.add(new Rekening09("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk"));
        daftarRekening.add(new Rekening09("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.net"));
        daftarRekening.add(new Rekening09("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "interdum.Curabitur.dictum@rutrumurna.edu"));
        daftarRekening.add(new Rekening09("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk"));
        daftarRekening.add(new Rekening09("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca"));
        daftarRekening.add(new Rekening09("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net"));
        daftarRekening.add(new Rekening09("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com"));
        daftarRekening.add(new Rekening09("16771126 7372", "Ignatius", "Lionel Kane", "353-5137", "cubilia.Curae.Phasellus@Duis.com"));
    
        daftarTransaksi.add(new Transaksi09(898214, 494048, 3587, "2021-03-09 07:54:42", "type1"));
        daftarTransaksi.add(new Transaksi09(205420, 200162, 775880, "2021-06-25 10:23:00", "type2"));
        daftarTransaksi.add(new Transaksi09(838632, 350929, 328316, "2021-09-18 23:00:04", "type3"));
        daftarTransaksi.add(new Transaksi09(230659, 204434, 690503, "2022-02-02 19:10:34", "type4"));
        daftarTransaksi.add(new Transaksi09(770592, 334245, 444267, "2020-08-11 13:36:56", "type5"));
        daftarTransaksi.add(new Transaksi09(685302, 451002, 376442, "2020-05-23 07:34:53", "type6"));
        daftarTransaksi.add(new Transaksi09(816129, 851403, 597842, "2021-07-18 19:41:20", "type7"));
        daftarTransaksi.add(new Transaksi09(989609, 333823, 802752, "2022-02-01 01:13:11", "type8"));
        daftarTransaksi.add(new Transaksi09(297103, 396116, 779589, "2021-07-03 01:09:49", "type9"));
        daftarTransaksi.add(new Transaksi09(66190, 259150, 619774, "2021-09-09 03:57:30", "type10"));
        daftarTransaksi.add(new Transaksi09(234301, 278309, 547922, "2021-08-24 13:18:39", "type11"));
        daftarTransaksi.add(new Transaksi09(243306, 869468, 50283, "2021-03-12 03:40:16", "type12"));
        daftarTransaksi.add(new Transaksi09(371045, 991242, 602034, "2021-08-06 11:48:59", "type13"));
        daftarTransaksi.add(new Transaksi09(395170, 97058, 472273, "2021-05-02 10:53:31", "type14"));
        daftarTransaksi.add(new Transaksi09(862731, 561908, 109431, "2021-07-31 08:11:00", "type15"));
        daftarTransaksi.add(new Transaksi09(556798, 31387, 725426, "2021-03-27 06:18:20", "type16"));
        daftarTransaksi.add(new Transaksi09(873982, 896213, 846142, "2021-07-18 04:06:30", "type17"));
        daftarTransaksi.add(new Transaksi09(774247, 739406, 775848, "2020-10-24 01:39:00", "type18"));
        daftarTransaksi.add(new Transaksi09(66987, 823014, 868772, "2020-12-21 05:57:59", "type19"));    
       
        Scanner sc09 = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan data rekening");
            System.out.println("2. Tampilkan data transaksi");
            System.out.println("3. Cari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            choice = sc09.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nData Rekening:");
                    for (Rekening09 rekening : daftarRekening) {
                        System.out.println(rekening);
                    }
                    break;
                case 2:
                    System.out.println("\nData Transaksi:");
                    for (Transaksi09 transaksi : daftarTransaksi) {
                        System.out.println(transaksi);
                    }
                    break;
                case 3:
                    System.out.println("\nSaldo > 500000:");
                    for (Transaksi09 transaksi : daftarTransaksi) {
                        if (transaksi.saldo > 500000) {
                            System.out.println(transaksi);
                        }
                    }
                    break;
                    case 4:
                    System.out.println("\nSorting by name:");
                    Collections.sort(daftarRekening, Comparator.comparing(rekening -> rekening.nama));
                    for (Rekening09 rekening : daftarRekening) {
                        System.out.println(rekening);
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu yang Anda pilih tidak valid!");
                    break;
            }
        } while (choice != 5);
        sc09.close();
    }
}