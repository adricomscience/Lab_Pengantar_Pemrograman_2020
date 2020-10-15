import java.util.Scanner;
public class Tugaspp2 {
    public static void main(String[] args) {
        int detik, menit, jam;
        int d;
        Scanner n = new Scanner(System.in);
        String sjam, smenit, sdetik;

        System.out.println("Masukkan Detik");
        d = n.nextInt();
        if(d > 3600 ){
            jam = d/3600;
            d = d%3600;


        }
        else {
            jam = 0;
        }
        if (d<3600 && d>60){
            menit = d/60;
            d = d%60;
        }
    
        else {
            menit = 0;
        }
        detik = d;
        
        if (jam<10 && jam>=1){
            sjam = "0"+ Integer.toString(jam);
        
        }
        else {
            sjam = Integer.toString(jam);
        }
        if (menit<10 && menit>=1){
            smenit = "0"+ Integer.toString(menit);
        }
        else{
            smenit = Integer.toString(menit);
        }
        if (detik<10 && detik>=1){
            sdetik = "0"+ Integer.toString(detik);

        }
        else {
            sdetik =  Integer.toString(detik);
        }
        System.out.println("Maka jam : menit : detiknya = ");

        System.out.printf( "%s:%s:%s", sjam,smenit,sdetik);

    }
}
