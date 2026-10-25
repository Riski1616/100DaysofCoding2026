soal1
import java.util.Scanner;

public class eval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();

        if (Y > X) {
            X++;
        } else if (Y < X) {
            X--;
        }

        if (Z > X) {
            X += 2;
        } else if (Z < X) {
            X -= 2;
        }

        System.out.println(X);

        input.close();
    }
}

soal2
import java.util.Scanner;

public class eval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double N = input.nextDouble();

        if (N % 1 == 0) {
            if (N % 2 == 0) {
                System.out.println("Bulat Genap");
            } else {
                System.out.println("Bulat Ganjil");
            }
        } else {
            System.out.println("Pecahan");
        }

        if (N > 0) {
            System.out.println("Positif");
        } else if (N < 0) {
            System.out.println("Negatif");
        }

        if (N >= 0 && N % 1 == 0) {
            System.out.println("Natural/Cacah");
        }

        input.close();
    }
}

soal3
import java.util.Scanner;

public class eval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 4 != 0 ||
                i % 4 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
