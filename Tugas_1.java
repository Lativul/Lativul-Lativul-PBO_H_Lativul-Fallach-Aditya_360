import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastThreeNIM = "360";
        String adminUsername = "Akang" + lastThreeNIM;
        String adminPassword = "Rahasia" + lastThreeNIM;
        String validNama = "Lativul Fallach Aditya";
        String validNIM = "202410370110360";

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals(adminUsername) && password.equals(adminPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (nama.equals(validNama) && nim.equals(validNIM)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
            // selesai amongus
        } else {
            System.out.println("====================");
            System.out.println("Pilihan tidak valid.");
            System.out.println("====================");
        }

        scanner.close();

    }
}


