import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        String predikat;
        String status;

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid!");
        } else {
            if (nilai >= 85) {
                predikat = "A";
            } else if (nilai >= 75) {
                predikat = "B";
            } else if (nilai >= 65) {
                predikat = "C";
            } else if (nilai >= 50) {
                predikat = "D";
            } else {
                predikat = "E";
            }

            if (nilai >= 60) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }

            System.out.println("\nNama : " + nama);
            System.out.println("\nNilai : " + nilai);
            System.out.println("\nPredikat Nilai : " + predikat);
            System.out.println("\nStatus = " + status);
        }
    }
}
