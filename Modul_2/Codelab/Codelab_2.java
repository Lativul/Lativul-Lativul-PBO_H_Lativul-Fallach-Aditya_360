import java.text.NumberFormat;
import java.util.Locale;

public class Codelab_2 {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("202310370311129", "Maharani", 500000.0);
        RekeningBank rekening2 = new RekeningBank("202310370311307", "Amelia", 1000000.0);

        System.out.println("========== INFORMASI REKENING ==========");
        rekening1.tampilkanInfo();
        System.out.println();
        rekening2.tampilkanInfo();
        System.out.println("==========================================================");
        System.out.println();

        System.out.println("========== SETORAN ==========");
        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);
        System.out.println("=======================================");
        System.out.println();

        System.out.println("========== PENARIKAN ==========");
        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);
        System.out.println("=========================================================================================");
        System.out.println();

        System.out.println(" ========================================");
        rekening1.tampilkanInfo();
        System.out.println();
        rekening2.tampilkanInfo();
        System.out.println("===========================================================");
    }
}

class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    private static final NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + formatRupiah.format(saldo));
    }


    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor " + formatRupiah.format(jumlah) + ". Saldo sekarang: " + formatRupiah.format(saldo));
    }

    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik " + formatRupiah.format(jumlah) + ". (Berhasil) Saldo sekarang: " + formatRupiah.format(saldo));
        } else {
            System.out.println(namaPemilik + " menarik " + formatRupiah.format(jumlah) + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: " + formatRupiah.format(saldo));
        }
    }
}
