import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Operator: ");
        char operator = input.next().charAt(0);

        System.out.print("Angka kedua: ");
        int angka2 = input.nextInt();

        int hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("===Kalkulator Sederhana===");
                System.out.println("Hasil dari " + angka1 + " + " + angka2 + " adalah " + hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.println("===Kalkulator Sederhana===");
                System.out.println("Hasil dari " + angka1 + " - " + angka2 + " adalah " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println("===Kalkulator Sederhana===");
                System.out.println("Hasil dari " + angka1 + " * " + angka2 + " adalah " + hasil);
                break;

            case '/':
                switch (angka2) {
                    case 0:
                        System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
                        break;
                    default:
                        hasil = angka1 / angka2;
                        System.out.println("===Kalkulator Sederhana===");
                        System.out.println("Hasil dari " + angka1 + " / " + angka2 + " adalah " + hasil);
                        break;
                }
                break;

            case '%':
                switch (angka2) {
                    case 0:
                        System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
                        break;
                    default:
                        hasil = angka1 % angka2;
                        System.out.println("===Kalkulator Sederhana===");
                        System.out.println("Hasil dari " + angka1 + " % " + angka2 + " adalah " + hasil);
                        break;
                }
                break;

            default:
                System.out.println("Operator tidak valid.");
                break;
        }

        input.close();
    }
}
