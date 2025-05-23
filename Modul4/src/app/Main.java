package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku fiksi = new Fiksi("Hujan", "Tere Liye");
        Buku nonFiksi = new NonFiksi("Bumi dan Manusia", "Pramoedya Ananta Toer");

        fiksi.displayInfo();
        System.out.println();
        nonFiksi.displayInfo();
        System.out.println();

        Anggota anggota1 = new Anggota("Wahy Andika", "ID: 8075");
        Anggota anggota2 = new Anggota("Herry Bagus", "ID: 0367");

        anggota1.pinjamBuku("Hujan");
        anggota2.pinjamBuku("Bumi dan Manusia");

        System.out.println();

        anggota1.displayPinjaman();
        System.out.println();

        anggota1.kembalikanBuku("Hujan");
        System.out.println();

        anggota2.displayPinjaman();
        System.out.println();

        anggota2.kembalikanBuku("Bumi dan Manusia");
        System.out.println();

        anggota1.displayPinjaman();
        anggota2.displayPinjaman();
    }
}
