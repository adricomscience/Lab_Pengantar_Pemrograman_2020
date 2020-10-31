import java.util.Scanner;
public class Nomor5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nilai derajat untuk di konversi :");
        while (input.hasNextFloat()) {
            float derajat= input.nextFloat();
            int n = (int) (derajat/ 360 * 24 * 3600);
            int jam = 6 + (n / 3600);
            int menit = (n % 3600) / 60;
            int detik = (n % 3600) % 60;
            if (derajat >= 0 && derajat <= 360) {
            if(jam > 23) {
                jam -= 24;
            }
            else{
                jam += 0;
            }
            if (jam >= 18) {
                System.out.println("Selamat malam!");
            } 
            else if (jam >= 15) {
                System.out.println("Selamat sore!");
            } 
            else if (jam >= 12) {
                System.out.println("Selamat siang!");
            } 
            else {
                System.out.println("Selamat pagi!");
            }
                System.out.printf("%02d:%02d:%02d%n", jam, menit, detik);
            }
            else {
                System.out.println("end of file");
            }
        
        }
    }
} 