import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Usia: ");
        double usia = input.nextDouble();

        boolean usiaKerja = usia >= 18 && usia <= 65;

        System.out.println("Usia kerja? : " + usiaKerja);
    }
}
