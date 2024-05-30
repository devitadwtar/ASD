public class Sum09 {
    public String namaPerusahaan; // Stores company name
    public int elemen;
    public double keuntungan[];
    public double total;
  
    Sum09(String namaPerusahaan, int elemen) {
      this.namaPerusahaan = namaPerusahaan;
      this.elemen = elemen;
      this.keuntungan = new double[elemen];
      this.total = 0;
    }
    
    double totalBF09(double arr[]) {
      for (int i = 0; i < elemen; i++) {
        total = total + arr[i];
      }
      return total;
    }
  
    double totalDC09(double arr[], int l, int r) {
      if (l == r) {
        return arr[l];
      } else if (l < r) {
        int mid = (l + r) / 2;
        double lsum = totalDC09(arr, l, mid - 1);
        double rsum = totalDC09(arr, mid + 1, r);
        return lsum + rsum + arr[mid];
      }
      return 0;
    }
  }
  