import java.util.Scanner;

public class eval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kategori, durasi, biaya = 0, total;
        int diskon = 0;
        String namaKategori, bonus;

        System.out.println("=== PENDAFTARAN MEMBER GYM ===");
        System.out.println("1. Reguler - Rp150000");
        System.out.println("2. Silver - Rp300000");
        System.out.println("3. Gold   - Rp500000");

        System.out.print("Pilih kategori (1-3): ");
        kategori = input.nextInt();

        if (kategori == 1) {
            namaKategori = "Reguler";
            biaya = 150000;
        } else if (kategori == 2) {
            namaKategori = "Silver";
            biaya = 300000;
        } else if (kategori == 3) {
            namaKategori = "Gold";
            biaya = 500000;
        } else {
            System.out.println("Kategori tidak tersedia");
            return;
        }

        System.out.print("Durasi (bulan): ");
        durasi = input.nextInt();

        total = biaya * durasi;

        if ((kategori == 3 && durasi >= 3) || total >= 1000000) {
            diskon = (int) (total * 0.15);
        } else {
            diskon = 0;
        }

        if (kategori == 3) {
            if (durasi >= 6) {
                bonus = "Tas Gym Eksklusif";
            } else {
                bonus = "Handuk Sport";
            }
        } else if (kategori == 2) {
            if (durasi >= 4) {
                bonus = "Botol Tumbler";
            } else {
                bonus = "Kaos Kaki Sport";
            }
        } else {
            bonus = "Tidak ada bonus";
        }

        System.out.println("\nOUTPUT:");
        System.out.println("Kategori: " + namaKategori);
        System.out.println("Biaya Per Bulan: Rp" + biaya);
        System.out.println("Durasi: " + durasi + " bulan");
        System.out.println("Total: Rp" + total);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Bayar: Rp" + (total - diskon));
        System.out.println("Bonus: " + bonus);

        input.close();
    }
}
