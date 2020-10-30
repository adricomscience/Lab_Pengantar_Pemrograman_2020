import java.util.Scanner;
public class Pratikum3No5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float m = read.nextFloat();
        float waktu = m/360*86400;
        int jam = 0, menit = 0, detik = 0;
        if (m >= 0 && m <=360) {
            while (waktu > 0) {
                if (waktu >= 3600) {
                    waktu = waktu-3600;
                    jam++;
                } else if (waktu >= 60 && waktu < 3600) {
                    waktu = waktu-60;
                    menit++;
                } else if (waktu >= 0 && waktu < 60) {
                    waktu = waktu-1;
                    detik++;
                }
            } jam = jam +6;
            if (jam>=6 && jam<12) {
                System.out.println("Selamat Pagi");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);
            } else if (jam>=12 && jam<15) {
                System.out.println("Selamat Siang");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);
            } else if (jam>=15 && jam<18) {
                System.out.println("Selamat Sore");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);
            } else {
                System.out.println("Selamat Malam");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);
            }
        } else {
            System.out.println("Inputan Salah");
            System.out.println("Nilai inputan : 0 <= nilai <= 360");
        }
    }
}
