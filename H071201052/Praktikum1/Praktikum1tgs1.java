import java.util.Scanner;
public class Praktikum1tgs1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // efisiensi mobil 14 km/L
        System.out.println("masukkan waktu tempuh perjalanan");
        int waktu = input.nextInt();
        System.out.println("masukkan kecepatan rata-rata");
        int kecepatan =input.nextInt();
        float bensin = (float) waktu * kecepatan / 14;

        System.out.printf("%.3f L" , bensin );


        
    }
}