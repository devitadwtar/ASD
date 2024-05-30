public class Faktorial09 {

    public int nilai;

    public int faktorialBF09(int n) {
        int fakto09 = 1;
        int i = 1;
        while (i <= n) {
            fakto09 = fakto09 * i;
            i++;
        }
        return fakto09;
    }

    public int faktorialDC09(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto09 = n * faktorialDC09(n - 1);
            return fakto09;
        }
    }
}