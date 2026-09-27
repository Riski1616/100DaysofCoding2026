import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int saldo = rr.nextInt();
        int penarikan = rr.nextInt();

        long prs = penarikan / 100000 * 100000;

        if (penarikan > saldo);
        long lembar = penarikan / 100000;
        long gagal = penarikan % 100000;

        System.out.println("berhasil ditarik = Rp" + prs);
        System.out.println("jumlah lembar = " + lembar + ("\tlembar"));
        System.out.println("gagal ditarik = Rp" + gagal);
    }
}
