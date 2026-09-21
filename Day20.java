import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan nilai: ");
        double nilai = input.nextDouble();

        String umurString = String.valueOf(umur);
        String nilaiString = String.valueOf(nilai);

        System.out.println("\nHasil konversi:");
        System.out.println("Umur dalam String : " + umurString);
        System.out.println("Nilai dalam String : " + nilaiString);
    }
}
