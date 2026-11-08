import java.util.Scanner;

public class day69 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = rr.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = rr.nextInt();

        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
