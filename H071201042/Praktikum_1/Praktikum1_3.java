import java.util.Scanner;
import java.lang.Math;

public class Praktikum1_3
{
    public static void main(String[] args)
    {
        Praktikum1_3 pK = new Praktikum1_3();
        Scanner scanner = new Scanner(System.in);
        int b,a;
        float h;

        System.out.println("Nama : Rendy Luis\nNim : H071201042\nKelas : Ilmu Komputer A\n");
        System.out.println("=======================================Praktikum 1.3=======================================\n");

        System.out.println("Masukkan tinggi menara(m), sudut elevasi pengamat terhadap ujung belakang kapal, dan sudut\nelevasi pengamat terhadap ujung depan kapal : ");
        h = scanner.nextFloat();
        a = scanner.nextInt();
        b = scanner.nextInt();

        if(90>a && a>b)
        {
            System.out.printf("Panjang kapal tersebut adalah = %.1f m\n", pK.panjangKapal(h,a,b));
        }
        else
        {
            System.out.println("Data yang anda masukkan tidak benar!!!");
        }
        System.out.println("===========================================================================================");
    }

    private float panjangKapal(float x, float y, float z)
    {
        y = (float)Math.tan(Math.toRadians(y));
        z = (float)Math.tan(Math.toRadians(z));
        return y*x-z*x;
    }
}