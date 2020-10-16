import java.util.Scanner;

public class Tambahan2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Masukkan Diameter Tabung : ");
        double d = read.nextDouble();
        double r = d/2;
        System.out.print("Masukkan Tinggi Tabung : ");
        double t = read.nextDouble();
        double v = Math.PI*r*r*t;
        System.out.printf("Volume Tabung : " + "%1.2f %n", v);
    }
}
