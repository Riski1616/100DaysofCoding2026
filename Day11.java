import java.util.Scanner; // Mengimpor Scanner untuk menerima input dari keyboard

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari keyboard

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        // Membaca input berupa teks dari pengguna

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        // Membaca input berupa angka bulat

        System.out.println("Nama: " + nama);
        // Menampilkan nama yang dimasukkan

        System.out.println("Umur: " + umur);
        // Menampilkan umur yang dimasukkan
    }
}
