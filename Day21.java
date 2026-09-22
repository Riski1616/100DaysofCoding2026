import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Memasukkan nilai pertama
        System.out.print("Masukkan nilai A: ");
        int A = input.nextInt();

        // Memasukkan nilai kedua
        System.out.print("Masukkan nilai B: ");
        int B = input.nextInt();

        System.out.println("\nSebelum ditukar:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Menukar nilai menggunakan variabel sementara
        int temp = A;
        A = B;
        B = temp;

        System.out.println("\nSetelah ditukar:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
