import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();

            if (angka == 0) {
                System.out.println("Program berhenti!");
                break;
            }

            if (angka < 0) {
                System.out.println("Angka negatif dilewati!");
                continue;
            }

            if (angka == 99) {
                System.out.println("Keluar dari program.");
                return;
            }

            System.out.println("Angka: " + angka);
        }
    }
}
