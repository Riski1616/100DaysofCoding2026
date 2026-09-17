import java.util.Scanner;
public class Day16 {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);

        System.out.println("masukkan angka pertama = ");
        int angka1 = ar.nextInt();

        System.out.println("masukkan angka kedua = ");
        int angka2 = ar.nextInt();

        int hasil = angka1 % angka2;

        System.out.println("\n =====HASIL PERHITUNGAN =====");
        System.out.println("Bilangan pertama = " + angka1);
        System.out.println("Bilangan kedua = " + angka2);
        System.out.println("sisa bagi = " + hasil);
        
    }
}
