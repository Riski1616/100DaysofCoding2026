import java.util.Scanner;

public class TarifPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double berat;
        int tarif;

        System.out.print("Masukkan berat barang: ");
        berat = input.nextDouble();

        if (berat <= 2) {
            tarif = 10000;
        } else if (berat <= 5) {
            tarif = 20000;
        } else {
            tarif = 35000;
        }

        System.out.println("Berat Barang: " + berat + " kg");
        System.out.println("Tarif Pengiriman: Rp" + tarif);

        input.close();
    }
}
