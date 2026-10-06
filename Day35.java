import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("Nilai: " + nilai);

        if (nilai >= 70) {
            if (nilai >= 80) {
                System.out.println("Kategori: Sangat Baik");
            } else {
                System.out.println("Kategori: Baik");
            }
        } else {
            if (nilai >= 50) {
                System.out.println("Kategori: Cukup");
            } else {
                System.out.println("Kategori: Kurang");
            }
        }
    }
}
