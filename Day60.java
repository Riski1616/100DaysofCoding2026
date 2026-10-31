import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, total = 0;

        System.out.print("Masukkan angka N: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("Jumlah angka 1 sampai " + n + " = " + total);
    }
}
