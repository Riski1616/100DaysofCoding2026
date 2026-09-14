import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("BIODATA MAHASISWA");

        System.out.println("masukkan nama");
        String nama = input.nextLine();

        System.out.println("masukkan nim");
        String nim = input.nextLine();

        System.out.println("masukkan tinggiBadan");
        double tinggiBadan = input.nextDouble();

        System.out.println("masukkan beratBadan");
        float beratBadan = input.nextFloat();

        System.out.println("masukkan statusMahasiswa");
        boolean statusMahasiswa = input.nextBoolean();

        System.out.println("BIODATA MAHASISWA");
        System.out.println("nama            :"  + nama);
        System.out.println("nim             :"  + nim);
        System.out.println("tinggiBadan     :"  + tinggiBadan);
        System.out.println("beratBadan      :"  + beratBadan);
        System.out.println("statusMahasiswa :"  + statusMahasiswa);
       
    }
}
