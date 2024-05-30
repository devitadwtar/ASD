import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner scanner09 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = scanner09.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        postfix09 post = new postfix09(total);
        P = post.convert(Q);
        System.out.println("Postfix: " + P);
    }
}
