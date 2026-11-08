// soal 1
import java.util.Scanner;

public class evaluasisatu {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        int N =rr.nextInt();

        int jumlah = 0;
        int faktorial = 1;
        System.out.print("deret 1 ke : " + N);
        for (int i = 1; i<=N; i++) {
            jumlah+=i;
            System.out.print(i + " ");
        } 
            System.out.println();
            System.out.print("deret " + N + "ke 1 :");
            
        int a = N;
        do {
            faktorial *=a;
            System.out.print(a + " "); 
            a--;   
        }while(a >= 1);
        
        System.out.println();
        System.out.println("jumlah : " + jumlah);
        System.out.println("faktorial : " + faktorial);
    }
}

// soal 2
import java.util.Scanner;

public class evaluasidua {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int jumlahgenap = 0;
        int totalgenap  = 0;
        int jumlahganjil = 0;
        int totalganjil = 0;
        for (int i = 1; i <= N; i++) {
            if(i % 2 == 0) {
                jumlahgenap ++;
                totalgenap += i;
            } else {
                totalganjil += i;
                jumlahganjil ++;
            }
        }
        System.out.println("total angka genap :" + totalgenap);
        System.out.println("jumlah angka genap :" + jumlahgenap);
        System.out.println("total angka ganjil :" + totalganjil);
        System.out.println("jumlah angka ganjil :" + jumlahganjil);
    }
}

// soal 3
import java.util.Scanner;

public class evaluasitiga {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int N = ss.nextInt();

        for (int i = 1; i <= N; i++) {
           for (int j = 1; j <= N; j++) {
            System.out.print("*");
           }
           System.out.println();
        }
    }
}
//soal 4
import java.util.Scanner;

public class evaluasiempat {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int N = ss.nextInt();

        for (int i = 3; i <= N; i+= 3) {
        if(i % 3 == 0) {   
            if(i % 2 == 0){
            System.out.print("genap");
            }else{
            System.out.print(i);
            }
        }
        System.out.println("");
        }
    }
}
