import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();

        if (nilai > 75) {
            System.out.println("Nilai lebih besar dari 75.");
        } else if (nilai < 75) {
            System.out.println("Nilai lebih kecil dari 75.");
        } else {
            System.out.println("Nilai sama dengan 75.");
        }

    }
}
