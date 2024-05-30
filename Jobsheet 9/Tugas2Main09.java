import java.text.SimpleDateFormat;
import java.util.Date;

public class Tugas2Main09 {

    public static void main(String[] args) {
        Date waktu = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        
        Tugas209 struk = new Tugas209(8);
        Tugas209[] belanja = new Tugas209[8];
        String date = sdf.format(waktu);
        
        belanja[0] = new Tugas209("RAIMARKET-0111-25", 7, 3000000, date);
        belanja[1] = new Tugas209("RAIMARKET-0111-28", 3, 30000, date);
        belanja[2] = new Tugas209("RAIMARKET-0111-31", 1, 18000, date);
        belanja[3] = new Tugas209("RAIMARKET-0711-02", 3, 59000, date);
        belanja[4] = new Tugas209("RAIMARKET-0711-06", 7, 366000, date);
        belanja[5] = new Tugas209("RAIMARKET-0711-18", 4, 180000, date);
        belanja[6] = new Tugas209("RAIMARKET-0711-22", 1, 60000, date);
        belanja[7] = new Tugas209("RAIMARKET-0711-29", 2, 24000, date);
        
        for (int i = 0; i < struk.size; i++) {
            struk.push(belanja[i]);
        }
        struk.print();
        System.out.println("\tData yang di-pop |struk 5 minggu|");
        struk.line(50);
        for (int i = 0; i < 5; i++) {
            struk.pop();
        }
        struk.print();
    }
}
