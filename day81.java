import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi elemen array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = rr.nextInt();
        }

        // Menampilkan semua elemen array
        System.out.println("\nIsi Array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": " + angka[i]);
        }
    }
}
