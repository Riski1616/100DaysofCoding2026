import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai ujian: ");
        double nilai = input.nextDouble();

        double pembanding = 75.0;

        System.out.println(nilai + " >= " + pembanding + " = " + (nilai >= pembanding));
        System.out.println(nilai + " <= " + pembanding + " = " + (nilai <= pembanding));
    }
}
