import java.util.Scanner;
public class Praktikum1tgs2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan detik");
        int detik = input.nextInt();
        int jam,menit;

        jam   =  detik / (3600) ; 
        detik =  detik - ((3600)*jam);
        menit =  detik / 60;
        detik =  detik - (menit *60);
        
        System.out.println("konversi detik ke jam : menit : detik");
        System.out.println(jam + " : " + menit + " : " + detik);
    }
}
