public class Main {
    public static void main(String[] args) {

        int[] angka = {10, 20, 30, 40, 50};

        // Menampilkan array awal
        System.out.println("Data Awal:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        // Mengubah elemen array
        angka[2] = 100;

        // Menampilkan array setelah diubah
        System.out.println("\nData Setelah Diubah:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
