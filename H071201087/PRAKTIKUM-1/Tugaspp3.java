import java.util.Scanner; 
import java.lang.Math;
public class Tugaspp3 {
    public static void main(String[] args) {
        int h, a, b;

        Scanner x = new Scanner(System.in);

        System.out.println("Masukkan Ketinggian Menara");
        h = x.nextInt();

        System.out.println("Masukkan Elevasi Belakang");
        a= x.nextInt();

        System.out.println("Masukkan Elevasi Depan");
        b = x.nextInt();


        float p1, p2;


        p1 = (float) (Math.tan(Math.toRadians(b)) * h);
        p2 = (float) (Math.tan(Math.toRadians(a)) * h);

        Float panjangkapal = p2 - p1;

        System.out.printf("Panjang kapal = " + "%.1f m" , panjangkapal);
       


    }
}
