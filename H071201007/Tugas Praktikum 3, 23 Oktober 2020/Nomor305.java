import java.util.Scanner;

public class Nomor305 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        while (input.hasNext()) {

            float M = input.nextFloat();
            int jam = 0, menit = 0, detik = 0;
            int detikSementara = (int) (M * 240);

            if (M >= 0 && M < 360) {
                while (detikSementara > 0) {
                    if (detikSementara - 3600 >= 0) {
                        detikSementara -= 3600;
                        jam++;
                    } else if (detikSementara - 60 >= 0) {
                        detikSementara -= 60;
                        menit++;
                    } else {
                        detikSementara -= 1;
                        detik++;
                    }
                }
                jam += 6;

                if (jam >= 24)
                    jam -= 24;

                if (jam <= 10) {
                    System.out.println("selamat pagi");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 14) {
                    System.out.println("selamat siang");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 18) {
                    System.out.println("selamat sore");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else {
                    System.out.println("selamat malam");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                }
            } else
                System.out.println("harap masukkan 0<=nilai<360");
        }

                

            
        

    }
}
