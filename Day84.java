import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = rr.nextInt();
        }

        int maksimal = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maksimal) {
                maksimal = angka[i];
            }
        }

        System.out.println("Angka maksimal adalah: " + maksimal);
    }
}
