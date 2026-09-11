public class Main {
    public static void main(String[] args) {

        byte angka = 127;
        // byte memiliki batas minimal -128 dan maksimal 127

        short tahun = 32767;
        // short memiliki batas minimal -32.768 dan maksimal 32.767

        int jumlah = 2147483647;
        // int memiliki batas minimal -2.147.483.648 dan maksimal 2.147.483.647

        long data = 9223372036854775807L;
        // long memiliki batas minimal -9.223.372.036.854.775.808
        // dan maksimal 9.223.372.036.854.775.807

        System.out.println("Nilai byte  : " + angka);
        System.out.println("Nilai short : " + tahun);
        System.out.println("Nilai int   : " + jumlah);
        System.out.println("Nilai long  : " + data);
    }
}
