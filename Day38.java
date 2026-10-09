import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihanTiket, banyakTiket;
        int hargaTiket = 0;
        int totalHarga;
        double diskon = 0;
        double totalBayar;
        String jenisTiket = "";

        System.out.println("=== PEMBELIAN TIKET BIOSKOP ===");
        System.out.println("1. Regular  - Rp40000");
        System.out.println("2. Sweetbox - Rp60000");
        System.out.println("3. VIP      - Rp90000");

        System.out.print("Pilih kategori (1-3): ");
        pilihanTiket = input.nextInt();

        if (pilihanTiket == 1) {
            jenisTiket = "Regular";
            hargaTiket = 40000;
        } else if (pilihanTiket == 2) {
            jenisTiket = "Sweetbox";
            hargaTiket = 60000;
        } else if (pilihanTiket == 3) {
            jenisTiket = "VIP";
            hargaTiket = 90000;
        } else {
            System.out.println("Kategori tidak tersedia");
            return;
        }

        System.out.print("Jumlah tiket: ");
        banyakTiket = input.nextInt();

        totalHarga = banyakTiket * hargaTiket;

        if (totalHarga >= 150000) {
            diskon = totalHarga * 0.15;
        } else if (totalHarga < 150000) {
            diskon = 0;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("\n=== OUTPUT ===");
        System.out.println("Kategori : " + jenisTiket);
        System.out.println("Harga    : Rp" + hargaTiket);
        System.out.println("Jumlah   : " + banyakTiket);
        System.out.println("Total    : Rp" + totalHarga);
        System.out.println("Diskon   : Rp" + (int) diskon);
        System.out.println("Total Bayar : Rp" + (int) totalBayar);

    }
}
