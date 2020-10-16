import java.util.Scanner;

public class Pratikum1No2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Masukkan Total Waktu (Detik) : ");
        int TW = read.nextInt();
        int Sisa1 = TW%3600;
        int Jam = TW/3600;
        int Menit = Sisa1/60;
        int Detik = TW-(Jam*3600)-(Menit*60);
            System.out.println("Konversi Waktu (Jam:Menit:Detik)");
            System.out.println(Jam + ":" + Menit + ":" + Detik);

        }
    }
