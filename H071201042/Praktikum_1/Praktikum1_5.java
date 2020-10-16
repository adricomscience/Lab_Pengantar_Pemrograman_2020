import java.util.Scanner;
import java.lang.Math;

public class Praktikum1_5 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double diameter,tinggi,luasAlas,volume;
        System.out.println("Nama : Rendy Luis\nNim : H071201042\nKelas : Ilmu Komputer A\n");
        System.out.println("=========================Praktikum 1.5=========================\n");

        System.out.print("Masukkan diameter dan tinggi tabung : ");
        diameter = scan.nextFloat();
        tinggi = scan.nextFloat();
        luasAlas = Math.PI*Math.pow((diameter/2),2);
        volume = luasAlas*tinggi;

        System.out.printf("Volume tabung adalah = %.2f\n",volume);

        System.out.println("===============================================================");
    }
}
