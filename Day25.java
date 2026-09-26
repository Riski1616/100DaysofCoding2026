import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jariJari, luas;
        final double PI = 3.14;

        System.out.print("Masukkan jari-jari lingkaran: ");
        jariJari = input.nextDouble();

        luas = PI * jariJari * jariJari;

        System.out.println("Luas lingkaran = " + luas);
    }
}
