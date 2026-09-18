import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner ri = new Scanner(System.in);
        // = membuat atau memasukkan nilai kedalam variabel
        // += menambahkan nilai ke nilai sebelumnya
        // -= mengurangi nilai variabel dengan nilai tertentu
        // *= mengalikan nilai variabel dengan nilai tertentu
        // /= membagi nilai variabel dengan nilai tertentu
        // %= mengisi variabel dengan hasil sisa pembagi

        System.out.println("masukkan angka awal");
        int angka = ri.nextInt();
        
        System.out.println("nilai awal = " + angka);

        System.out.println("masukkan nilai untuk += :");
        int tambah = ri.nextInt();
        angka += tambah;
        System.out.println("hasil += " + angka);

        System.out.println("masukkan nilai untuk -= :");
        int kurang = ri.nextInt();
        angka -= kurang;
        System.out.println("hasil -= " + angka);

        System.out.println("masukkan nilai untuk *= : ");
        int kali = ri.nextInt(); 
        angka *= tambah;
        System.out.println("hasil *= " + angka);

        System.out.println("masukkan nilai untuk /= : ");
        int bagi = ri.nextInt();
        angka /= bagi;
        System.out.println("hasil /= " + angka);

        System.out.println("masukkan nilai untuk %= : ");
        int modulus = ri.nextInt();
        angka %= modulus;
        System.out.println("hasil %= " + angka);
    }
    
}
