import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Goreng");
            System.out.println("3. Ayam Geprek");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = rr.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Nasi Goreng");
                    break;
                case 2:
                    System.out.println("Anda memilih Mie Goreng");
                    break;
                case 3:
                    System.out.println("Anda memilih Ayam Geprek");
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 4);
    }
}
