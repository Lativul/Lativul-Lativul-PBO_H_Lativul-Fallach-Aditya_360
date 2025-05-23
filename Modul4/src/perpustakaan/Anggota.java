package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String anggotaID;

    public Anggota(String nama, String anggotaID) {
        this.nama = nama;
        this.anggotaID = anggotaID;
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println("------------------------------------");
        System.out.println(nama + " meminjam buku: " + judul);
        System.out.println("------------------------------------");
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println("-----------------------------------------");
        System.out.println(nama + " mengembalikan buku: " + judul);
        System.out.println("-----------------------------------------");
    }

    public void displayPinjaman() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println(nama + " saat ini tidak memiliki daftar pinjaman yang disimpan.");
        System.out.println("-------------------------------------------------------------------");
    }
}
