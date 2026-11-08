import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan tinggi: ");
        int tinggi = rr.nextInt();

        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
