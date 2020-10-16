import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner tika = new Scanner (System.in);
        System.out.print("masukkan total waktu dalam detik");
        int totalWaktu = tika.nextInt();

        int jam = totalWaktu/3600;
        int menit = ((totalWaktu%3600)/60);
        int detik =totalWaktu%60;

        System.out.println("hasil konversi jam : menit : detik");
        System.out.println(jam + ":" + menit + ":" + detik);

        



    }
 
}
