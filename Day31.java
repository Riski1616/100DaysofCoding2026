import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username;
        int password;
        boolean akunDiblokir;
        boolean aksesKhusus;

        System.out.print("Masukkan username: ");
        username = input.nextLine();

        System.out.print("Masukkan password: ");
        password = input.nextInt();

        System.out.print("Akun diblokir (true/false): ");
        akunDiblokir = input.nextBoolean();

        System.out.print("Memiliki akses khusus (true/false): ");
        aksesKhusus = input.nextBoolean();

        boolean usernameBenar = username.equals("Riski");
        boolean passwordBenar = password == 125;

        boolean hasil = (usernameBenar && passwordBenar && !akunDiblokir)
                        || aksesKhusus;

        System.out.println("Hasil: " + hasil);
    }
}
