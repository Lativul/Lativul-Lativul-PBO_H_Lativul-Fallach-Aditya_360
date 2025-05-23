package com.praktikum.users;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private String nama;
    private String nim;

    public Mahasiswa(String username, String password, String nama, String nim) {
        super(username, password);
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    @Override
    public void displayAppMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            while (!input.hasNextInt()) input.next();
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> reportItem();
                case 2 -> viewReportedItems();
                case 0 -> System.out.println("Logout berhasil.\n");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    @Override
    public void reportItem() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = input.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = input.nextLine();
        System.out.println(">> Laporan barang berhasil dicatat! <<");
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }
}
