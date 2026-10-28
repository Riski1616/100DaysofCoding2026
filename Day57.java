import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int n = input.nextInt();

        System.out.println("Angka ganjil:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("Angka genap:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
