import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int angka;
        int jumlah = 0;

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = rr.nextInt();

            if (angka < 0) {
                break;
            }

            jumlah += angka;
        }

        System.out.println("Total penjumlahan: " + jumlah);
    }
}
