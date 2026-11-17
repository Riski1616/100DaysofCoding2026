import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = rr.nextLine();

        System.out.println("Nama: " + nama);
        System.out.println("Jumlah karakter: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());
        System.out.println("Sama dengan Riski: " + nama.equals("Riski"));
        System.out.println("Mengandung i: " + nama.contains("i"));
        System.out.println("3 karakter pertama: " + nama.substring(0, 3));
        System.out.println("Ganti i menjadi a: " + nama.replace("i", "a"));
    }
}
