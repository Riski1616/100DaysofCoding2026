import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor tiket: ");
        int nomor = input.nextInt();

        String hasil = (nomor == 0) ? "Tiket Tidak Valid"
                     : (nomor % 2 == 0) ? "Loket A"
                     : "Loket B";

        System.out.println("Silakan menuju ke: " + hasil);

        input.close();
    }
}
