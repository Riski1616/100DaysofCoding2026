import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        if (a>35.0) {
            System.out.println("sangat panas");
        } else if (a > 28 && a <= 35) {
            System.out.println("gerah");
        } else if (a > 25 && a <= 28 ) {
            System.out.println("sejuk");
        } else if (a > 20 && a <= 25 ) {
            System.out.println("sangat dingin");
        } else if (a > 15 && a <= 20 ) {
            System.out.println("dingin");
        } else {
            System.out.println("tidak ada kondisi");
        }
    }
}
