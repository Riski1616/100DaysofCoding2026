
import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.println(i + " x " + angka + " = " + (i * angka));
            i++;
        }

        input.close();
    }
}
