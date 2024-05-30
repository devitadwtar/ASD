public class PersegiPanjang09 {
    public int panjang;
    public int lebar;
  
    public PersegiPanjang09(int p, int l) {
      panjang = p;
      lebar = l;
    }

    public void cetakInfo(){
      System.out.println("Panjang : "+ panjang);
      System.out.println("Lebar : "+lebar);
    }
    public void hitungLuas() {
        int luas = panjang*lebar;
        System.out.println("Luas: "+luas);
    }
  
    public void hitungKeliling() {
      int keliling = 2 * (panjang + lebar);
      System.out.println("Keliling: "+keliling);
    }
  }
  