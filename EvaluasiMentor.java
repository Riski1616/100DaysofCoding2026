Soal1
public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("nama\t  : Riski\nnim\t  : D0226512\nkelas\t  : B\nMahasiswa : True\n");
    }
}

soal2
  public class App {
    public static void main(String[] args) {

        double angka1 = 2.5666;
        double angka2 = 3.1455;

        System.out.printf("%.2f%n", angka1);
        System.out.printf("%.2f%n", angka2);
    }
}

soal3
  public class App {
    public static void main(String[] args) {
        
        String nama = "Riski";
        int umur = 18;

        System.out.println("Sebelum");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        
        nama = "ekki";
        umur = 19;

        System.out.println("Sesudah");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}

soal4
  
import java.util.Scanner;

public class eval{
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

soal5
  
public class App {
    public static void main(String[] args) throws Exception {
        String nama = "Riski";
        int nim = 90226512;
        byte umur = 18;
        short tahun = 2008;
        long jumlahMahasiswa = 100000000L;
        char jeniskelamin = 'p';
        double beratBadan = 59.21;
        float tinggiBadan = 170.22f;
        boolean kelulusan = true;

        System.out.println("nama              = " + nama);
        System.out.println("nim               = " + nim);
        System.out.println("umur              = " + umur);
        System.out.println("tahun             = " + tahun);
        System.out.println("jumlahMahasiswa   = " + jumlahMahasiswa);
        System.out.println("jenisKelamin      = " + jeniskelamin);
        System.out.println("beratBadan        = " + beratBadan);
        System.out.println("tinggiBadan       = " + tinggiBadan);
        System.out.println("kelulusan         = " + kelulusan);




        
    }
}








