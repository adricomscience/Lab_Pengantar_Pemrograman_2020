import java.util.Scanner;

public class Tugaspp1 {
    public static void main(String[] args) {
       
        int waktu, kecepatan;
        float liter;

        Scanner inputNumScanner = new Scanner(System.in);

        System.out.println("Masukkan Lama perjalanan (Jam)");
        waktu = inputNumScanner.nextInt();

        System.out.println("Masukkan Kecepatan Raata-rata (km/jam)");
        kecepatan = inputNumScanner.nextInt();

        liter = (float) waktu/14*kecepatan;

        String.format("%.3f",liter);


        System.out.println("Jumlah Liter yang digunakan selama "+waktu+ " jam");

        System.out.printf("Dengan kecepatan rata-rata %d km/jam"+" adalah = %.3f L\n" , kecepatan, liter);

    }
}
