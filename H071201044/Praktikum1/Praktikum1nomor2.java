import java.util.Scanner;
public class Praktikum1nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Detik :");
        int detik = input.nextInt();
        int jam;
        jam = detik/3600;
        int menit;
        menit = (detik/60) - (jam*60);
        
        detik = detik - (menit*60) - (jam*3600);
        System.out.printf("%02d:%02d:%02d", jam, menit, detik);
        

    }
}
