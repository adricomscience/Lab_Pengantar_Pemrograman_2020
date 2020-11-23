import java.util.Scanner;

public class Pratikum5No3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int umur = read.nextInt();
        int tahun = 0;
        int bulan = 0;
        int hari = 0;
        if (umur >= 365) {
            tahun = myDay(umur);
            umur -= tahun*365;
        } if (umur >= 30 && umur < 365) {
            bulan = myDay(umur);
            umur -= bulan*30;
        } if (umur > 0 && umur < 30) {
            hari = umur;
        }
        System.out.println(tahun + " tahun");
        System.out.println(bulan + " bulan");
        System.out.println(hari + " hari");
    }
    
    public static int myDay(int usia) {
        int konversi = 0;
        if (usia >= 365) {
            konversi = usia/365;
        } else if (usia >= 30) {
            konversi = usia/30;
        } else {
            konversi = usia;
        }
        return konversi;
    }
}
