import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n===== Menu Manajemen Stok =====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.println("\uD83D\uDCD9");
            System.out.println("\n===============");
            System.out.print("Pilih opsi: ");
            int pilihan ;
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!!!");
                System.out.println("\n==========================");
                scanner.nextLine();
                continue;
            }
            switch (pilihan) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan stok awal: ");
                    try {
                        int stok = scanner.nextInt();
                        daftarBarang.add(new Barang(nama, stok));
                        System.out.println("Barang '" + nama + "' berhasil ditambahkan.");
                        System.out.println("\n==========================");
                    } catch (InputMismatchException e) {

                        System.out.println("Input stok harus berupa angka!");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("\n--- Daftar Barang ---");
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Stok barang kosong.");
                    } else {
                        for (int i = 0; i < daftarBarang.size(); i++) {
                            Barang b = daftarBarang.get(i);
                            System.out.println(i + ". Nama: " + b.getNama() + ", Stok: " + b.getStok());
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n--- Daftar Barang (Pilih untuk Kurangi Stok) ---");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        Barang b = daftarBarang.get(i);
                        System.out.println(i + ". " + b.getNama() + " (Stok: " + b.getStok() + ")");
                    }
                    try {
                        System.out.print("Masukkan nomor indeks barang: ");
                        int index = scanner.nextInt();
                        Barang barang = daftarBarang.get(index);
                        System.out.print("Masukkan jumlah stok yang akan diambil: ");
                        int jumlah = scanner.nextInt();
                        if (jumlah > barang.getStok()) {
                            throw new StokTidakCukupException("Stok untuk '" + barang.getNama() + "' hanya tersisa " + barang.getStok());
                        }
                        barang.setStok(barang.getStok() - jumlah);
                        System.out.println("Stok barang '" + barang.getNama() + "' berhasil dikurangi. Sisa stok: " + barang.getStok());

                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        scanner.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks barang tidak valid!");
                    } catch (StokTidakCukupException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih! Program berakhir.");
                    running = false;
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }

        scanner.close();
    }
}
