public class Pangkat09 {
    public int nilai, pangkat;

    public Pangkat09(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int pangkatBF09(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int pangkatDC09(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC09(a, n / 2) * pangkatDC09(a, n / 2) * a);
            } else {
                return (pangkatDC09(a, n / 2) * pangkatDC09(a, n / 2));
            }
        }
    }
}
