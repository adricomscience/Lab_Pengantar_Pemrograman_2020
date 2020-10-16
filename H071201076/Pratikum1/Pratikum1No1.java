import java.util.Scanner;

public class Pratikum1No1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Masukkan Waktu Tempuh (Jam) : ");
        float t = read.nextFloat();
        System.out.print("Masukkan Kecepatan Rata-Rata (KM/Jam) : ");
        float v = read.nextFloat();
        float s = v*t;
        float b = s/14;
        System.out.printf("Bensin Yang Digunakan : " + "%1.3f %n", b);
    }
}