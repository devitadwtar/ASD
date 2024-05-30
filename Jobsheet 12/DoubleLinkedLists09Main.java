/**
 * DoubleLinkedLists09Main
 */
public class DoubleLinkedLists09Main {

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists09 dll = new DoubleLinkedLists09();
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("=========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("=========================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("=========================================");
        System.out.println("Data awal pada Linked Lists adalah: "+ dll.getFirst());
        System.out.println("Data akhir pada Linked List adalah: "+dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked List adalah: "+dll.get(1));
    }
}