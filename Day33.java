import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Bilangan positif");
        } else {
            System.out.println("Bukan bilangan positif");
        }
    }
}
