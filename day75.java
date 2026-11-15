import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = rr.nextLine();

        System.out.println("Equals: " + nama.equals("Riski"));
        System.out.println("EqualsIgnoreCase: " + nama.equalsIgnoreCase("Riski"));
        System.out.println("Contains: " + nama.contains("Ris"));
        System.out.println("IsEmpty: " + nama.isEmpty());
    }
}
