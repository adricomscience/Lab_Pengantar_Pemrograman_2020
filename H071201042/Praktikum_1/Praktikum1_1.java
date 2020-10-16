import java.util.Scanner;

public class Praktikum1_1 
{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        System.out.println("Nama : Rendy Luis\nNim : H071201042\nKelas : Ilmu Komputer A\n");
        System.out.println("=========================Praktikum 1.1=========================\n");

        System.out.println("Masukkan Kecepatan Rata-rata (Km/h) dan Waktu Yang Ditempuh (Jam): ");
        int a=scan.nextInt();       //waktu yang ditempuh
        int b=scan.nextInt();       //kecepatan rata-rata

        float z = a*b/14f;
        System.out.println("Jumlah BBM Yang Dibutuhkan: "+String.format("%.3f",z)+" L"); //output
        System.out.println("===============================================================");
    }

}
