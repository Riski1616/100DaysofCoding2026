import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        String userBenar, passBenar;
        String username, password;

        System.out.println("=== BUAT AKUN ===");
        System.out.print("Buat Username: ");
        userBenar = rr.nextLine();

        System.out.print("Buat Password: ");
        passBenar = rr.nextLine();

        System.out.println("\n=== LOGIN ===");

        do {
            System.out.print("Username: ");
            username = rr.nextLine();

            System.out.print("Password: ");
            password = rr.nextLine();

            if (!username.equals(userBenar) || !password.equals(passBenar)) {
                System.out.println("Username atau Password Salah!\n");
            }

        } while (!username.equals(userBenar) || !password.equals(passBenar));

        System.out.println("\nLogin Berhasil!");
        System.out.println("Selamat Datang, " + username);
    }
}
