package com.praktikum.users;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = null;

        Admin admin = new Admin("admin", "adminjutek", "Admin Sistem");
        Mahasiswa mhs = new Mahasiswa("mhs", "mhsumm", "Lativul Fallach Aditya", "202410370110360");

        System.out.println("=== SELAMAT DATANG DI SISTEM ===");

        boolean berhasilLogin = false;
        while (!berhasilLogin) {
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            if (admin.login(username, password)) {
                user = admin;
                berhasilLogin = true;
            } else if (mhs.login(username, password)) {
                user = mhs;
                berhasilLogin = true;
            } else {
                System.out.println("Login gagal. Username atau password salah.\n");
            }
        }

        user.displayAppMenu();
        System.out.println("Terima kasih telah menggunakan sistem.");
    }
}
