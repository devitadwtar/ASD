public class canteenYG09 {
    public static void main(String[] args) {
        Item09 item1 = new Item09("Donat YG", 15000, 20);
        Item09 item2 = new Item09("Bubur sum sum", 15000, 15);
        Item09 item3 = new Item09("Pie matcha", 10000, 25);

        Item09[] items = new Item09[3];

        items[0] = item1;
        items[1] = item2;
        items[2] = item3;

        for (int i = 0; i < items.length; i++) {
            items[i].displayInfo();
            System.out.println();
        }
    }
}
