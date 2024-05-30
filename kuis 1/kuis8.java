public class kuis8 {
    public static void main(String[] args) {
        boolean kondisi;
        int i;
        i = 100;
        do{
            i -= 30;
            kondisi = i < 0;
        } while (!kondisi);
        System.out.println("i = " + i);
    }
    
}
