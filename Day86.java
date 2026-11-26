import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.print("Masukkan angka yang dicari: ");
        int cari = rr.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                System.out.println("Angka ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Angka tidak ditemukan");
        }
    }
}
