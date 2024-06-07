import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList09 {
    public static void main(String[] args) {
        // Mengganti List<Object> dengan List<Integer>
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        // Menghapus baris berikut karena "Cireng" bukan Integer
        // l.add("Cireng"); 
        
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
            l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
            l.get(0), l.size(), l.get(l.size() - 1));

        LinkedList<String> names = new LinkedList<>();

        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n",
            names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());

        names.add("Nouren");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", 
            names.get(0), names.size(), names.get(names.size() - 1));
        System.out.printf("Elemen 1: %s total elemen: %d elemen terakhir: %s\n", 
            names.get(1), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + String.join(", ", names));
    }
}
