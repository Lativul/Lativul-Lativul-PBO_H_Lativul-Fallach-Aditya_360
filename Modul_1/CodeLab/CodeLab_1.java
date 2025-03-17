import java.time.LocalDate;
import java.util.Scanner;

public class CodeLab_1 {
    public static void main(String[] args) {
        String namaSaya;
        String jenisKelamin;
        int tahunLahir, tahunSekarang, umur;

        tahunSekarang = LocalDate.now().getYear();

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        namaSaya = scan.nextLine();

        System.out.print("Masukkan gender (P/L) : ");
        jenisKelamin = scan.nextLine().trim().toUpperCase();

        System.out.print("Masukkan Tahun Lahir: ");
        while (!scan.hasNextInt()) {
            System.out.println("Harap masukkan angka!");
            scan.next();
        }
        tahunLahir = scan.nextInt();
        scan.nextLine();

        umur = tahunSekarang - tahunLahir;

        switch (jenisKelamin) {
            case "L":
                jenisKelamin = "Laki-Laki";
                break;
            case "P":
                jenisKelamin = "Perempuan";
                break;
            default:
                jenisKelamin = "Gender tidak diketahui";
        }

        System.out.println("========== Data Diri ==========");
        System.out.printf("Nama          : %s%n", namaSaya);
        System.out.printf("Jenis Kelamin : %s%n", jenisKelamin);
        System.out.printf("Umur          : %d tahun%n", umur);
        System.out.println("===============================");

        scan.close();
    }
}
