import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // int ke long
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();
        long jumlahBesar = jumlah;

        // int ke double
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        double umurDesimal = umur;

        // float ke double
        System.out.print("Masukkan nilai: ");
        float nilai = input.nextFloat();
        double nilaiBesar = nilai;

        System.out.println("\n=== HASIL KONVERSI ===");
        System.out.println("Jumlah barang (int)    = " + jumlah);
        System.out.println("Jumlah barang (long)   = " + jumlahBesar);

        System.out.println("Umur (int)             = " + umur);
        System.out.println("Umur (double)          = " + umurDesimal);

        System.out.println("Nilai (float)          = " + nilai);
        System.out.println("Nilai (double)         = " + nilaiBesar);
    }
}
