import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Praktikum1_4 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float rusuk,luasPermukaan;
        System.out.println("Nama : Rendy Luis\nNim : H071201042\nKelas : Ilmu Komputer A\n");
        System.out.println("=========================Praktikum 1.4=========================\n");

        System.out.print("Masukkan panjang rusuk kubus : ");
        rusuk = scan.nextFloat();

        luasPermukaan = 6f*(float)Math.pow(rusuk, 2);
        DecimalFormat decimal = new DecimalFormat("#.##");
        System.out.println("Luas Permukaan kubus adalah = "+decimal.format(luasPermukaan));

        System.out.println("===============================================================");
    }    
}
