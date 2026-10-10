import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double angka1, angka2, hasil;

        System.out.println("=== KALKULATOR ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih operasi: ");
        pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        if (pilihan == 1) {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + hasil);
        }

        if (pilihan == 2) {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);
        }

        if (pilihan == 3) {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);
        }

        if (pilihan == 4 && angka2 != 0) {
            hasil = angka1 / angka2;
            System.out.println("Hasil: " + hasil);
        }

        if (pilihan == 4 && angka2 == 0) {
            System.out.println("Tidak bisa dibagi nol");
        }

        if (pilihan < 1 || pilihan > 4) {
            System.out.println("Pilihan tidak valid");
        }
    }
}
