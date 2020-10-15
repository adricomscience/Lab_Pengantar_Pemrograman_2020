import java.util.Scanner;
public class KonversiWaktu{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int detik, menit, jam , secon;
        System.out.println("masukan detik ");
        detik = n.nextInt();
        jam = detik/3600;
        menit = (detik%3600)/60;
        secon = (detik%3600)%60;
        System.out.printf("%02d jam : %02d menit : %02d detik", jam, menit, secon);
    }
}