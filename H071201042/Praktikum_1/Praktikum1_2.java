import java.util.Scanner;

public class Praktikum1_2 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a,detik,menit,jam;

        System.out.println("Nama : Rendy Luis\nNim : H071201042\nKelas : Ilmu Komputer A\n");
        System.out.println("=======================================Praktikum 1.2=======================================\n");

        System.out.print("Masukkan jumlah detik yang ingin anda konversi menjadi jam:menit:detik : ");
        a = scan.nextInt();
        
        jam = a/3600;
        menit = (a-jam*3600)/60;
        detik = a-jam*3600-menit*60;

        System.out.printf("Hasil konversi %d ke jam:menit:detik = %02d:%02d:%02d\n",a,jam,menit,detik);

        System.out.println("===========================================================================================");
    }
}
