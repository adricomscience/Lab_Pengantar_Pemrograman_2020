import java.util.Scanner;
import java.lang.Math;
public class MencariVolumeTabung{
    public static void main(String[] arg){
        Scanner n = new Scanner(System.in);
        System.out.printf("Masukkan Panjang diameter: ");
        double d = n.nextDouble();
        double r = d/2;
        System.out.printf("Masukkan Tinggi Tabung: ");
        double t = n.nextDouble();
        double volume = Math.PI*r*r*t;
        System.out.printf("volume tabung : %.2f",volume);

    }
}