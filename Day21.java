import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        String umurString = input.nextLine();

        System.out.print("Masukkan tinggi badan: ");
        String tinggiString = input.nextLine();

        System.out.print("Masukkan nilai: ");
        String nilaiString = input.nextLine();

        System.out.print("Masukkan status mahasiswa (true/false): ");
        String statusString = input.nextLine();

        int umur = Integer.parseInt(umurString);
        double tinggi = Double.parseDouble(tinggiString);
        float nilai = Float.parseFloat(nilaiString);
        boolean status = Boolean.parseBoolean(statusString);

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi : " + tinggi + " cm");
        System.out.println("Nilai : " + nilai);
        System.out.println("Mahasiswa aktif : " + status);

        input.close();
    }
}
