import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilaiUjian = input.nextInt();

        System.out.print("Masukkan nilai standar: ");
        int nilaiStandar = input.nextInt();

        if (nilaiUjian == nilaiStandar) {
            System.out.println("Nilai ujian sama dengan nilai standar.");
        }

        if (nilaiUjian != nilaiStandar) {
            System.out.println("Nilai ujian berbeda dari nilai standar.");
        }

    }
}
