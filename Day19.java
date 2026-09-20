import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai desimal: ");
        double nilai = input.nextDouble();

        System.out.print("Masukkan harga: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jarak: ");
        long jarak = input.nextLong();

        // Konversi manual / paksa
        int nilaiInt = (int) nilai;
        int hargaInt = (int) harga;
        int jarakInt = (int) jarak;

        System.out.println("\n=== HASIL KONVERSI ===");
        System.out.println("Nilai awal  : " + nilai);
        System.out.println("Menjadi int : " + nilaiInt);

        System.out.println("\nHarga awal  : " + harga);
        System.out.println("Menjadi int : " + hargaInt);

        System.out.println("\nJarak awal  : " + jarak);
        System.out.println("Menjadi int : " + jarakInt);
    }
}
