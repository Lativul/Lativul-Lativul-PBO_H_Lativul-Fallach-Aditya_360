// Nama class utama
public class Codelap_1 {

    // Ini class nested (class di dalam class) buat blueprint karakter game
    static class KarakterGame {
        private String nama; // Variabel buat nyimpen nama karakter
        private int kesehatan; // Variabel buat nyimpen jumlah HP/kesehatan

        // Constructor -> auto kepanggil pas bikin objek baru
        public KarakterGame(String nama, int kesehatan) {
            this.nama = nama; // 'this' nunjuk ke variabel dalam class
            this.kesehatan = kesehatan;
        }

        // Getter buat ambil nama
        public String getNama() {
            return nama;
        }
        // Setter buat ngubah nama
        public void setNama(String nama) {
            this.nama = nama;
        }
        // Getter buat ambil kesehatan
        public int getKesehatan() {
            return kesehatan;
        }
        // Setter buat ngubah kesehatan
        public void setKesehatan(int kesehatan) {
            this.kesehatan = kesehatan;
        }
        // Method serang, basic attack tanpa damage, cuma print doang
        public void serang(KarakterGame target) {
            System.out.println(nama + " menyerang " + target.getNama());
        }
    }
    // Class Pahlawan (anak class KarakterGame) --> inheritance nih coy
    static class Pahlawan extends KarakterGame {
        // Constructor Pahlawan, nerusin constructor dari parent (KarakterGame) pake super
        public Pahlawan(String nama, int kesehatan) {
            super(nama, kesehatan);
        }
        // Override method serang -> pahlawan punya attack spesial
        @Override
        public void serang(KarakterGame target) {
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
            // Kurangin HP target sebanyak 20
            target.setKesehatan(target.getKesehatan() - 20);
            System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }
    }

    // Class Musuh, juga turunan dari KarakterGame
    static class Musuh extends KarakterGame {

        // Constructor Musuh, sama nerusin dari parent
        public Musuh(String nama, int kesehatan) {
            super(nama, kesehatan);
        }

        // Override method serang -> musuh juga punya attack beda (pake sihir)
        @Override
        public void serang(KarakterGame target) {
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
            // Kurangin HP target sebanyak 15
            target.setKesehatan(target.getKesehatan() - 15);
            System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
        }
    }

    // Method utama, tempat ngelakuin aksi
    public static void main(String[] args) {

        // Bikin objek karakter umum, pahlawan, dan musuh
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        // Print status awal HP mereka
        System.out.println("Status awal:");
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());

        // Brimstone nyerang Viper
        brimstone.serang(viper);
        // Viper nyerang Brimstone
        viper.serang(brimstone);
    }
}
