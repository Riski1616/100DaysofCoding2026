import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner rr = new Scanner(System.in);

        String nama = rr.next();

        System.out.println("Nama       : " + nama);
        System.out.println("Jumlah     : " + nama.length());
        System.out.println("Huruf Besar: " + nama.toUpperCase());
        System.out.println("Huruf Kecil: " + nama.toLowerCase());

    }
}
