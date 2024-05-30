public class dataMenuDemo09 {

    public static void tampilkanDataMenu(Menu[] arrayOfMenu) {
        for (int i = 0; i < arrayOfMenu.length; i++) {
            System.out.println("Data menu ke-" + (i + 1));
            arrayOfMenu[i].tampilkanMenu();
        }
    }

    public static void main(String[] args) {
        
         Menu[] arrayOfMenu = new Menu[3];

        for (int i = 0; i < arrayOfMenu.length; i++) {
             arrayOfMenu[i] = new Menu();
         }

         for (int i = 0; i < arrayOfMenu.length; i++) {
             System.out.println("Data menu ke-" + (i + 1));
             arrayOfMenu[i].tampilkanMenu();
         }
    }
}
