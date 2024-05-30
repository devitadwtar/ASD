public class Main {

    public static void main(String[] args) {
        ScavengerHunt scavengerHunt = new ScavengerHunt();
        scavengerHunt.addPoint("Tahun berapa Indonesia merdeka?", "1945");
        scavengerHunt.addPoint("Ibukota Provinsi Jawa Timur", "Surabaya");
        scavengerHunt.addPoint("Penjaga gawang AFC U-23 2024 Indonesia vs Korea Selatan?", "Ernando");

        System.out.println("==================================================================");
        System.out.println("                          SELAMAT DATANG                            ");
        System.out.println("==================================================================");

        System.out.println("- - - - - - - - - - - GAME SCAVENGER HUNT - - - - - - - - - - - - -");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("    Anda harus menjawab pertanyaan untuk menemukan harta karun !   ");
        if (scavengerHunt.playGame()) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Selamat! Anda berhasil menjawab semua pertanyaan dengan benar!");
            System.out.println("Anda mendapatkan harta karun!");
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Sayangnya, Anda gagal menjawab semua pertanyaan dengan benar.");
            System.out.println("Silakan coba lagi lain waktu.");
            System.out.println("---------------------------------------------------------------");
        }
    }
}