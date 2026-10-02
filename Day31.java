import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Username benar (true/false): ");
        boolean username = input.nextBoolean();

        System.out.print("Password benar (true/false): ");
        boolean password = input.nextBoolean();

        System.out.print("Akun diblokir (true/false): ");
        boolean diblokir = input.nextBoolean();

        System.out.print("Memiliki akses khusus (true/false): ");
        boolean aksesKhusus = input.nextBoolean();

        boolean hasil = (username && password && !diblokir) || aksesKhusus;

        System.out.println("Hasil: " + hasil);
    }
}
