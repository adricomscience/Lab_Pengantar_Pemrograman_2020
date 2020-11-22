import java.util.Scanner;

public class Nomor503 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("============================");
        System.out.println(" Masukkan jumlah hari (a) ");
        System.out.println("============================");
        int a = input.nextInt();
        input.close();
        int year = year(a);
        int month = month(a);
        int day = day(a);
        System.out.println("=============================================");
        System.out.println(" Tampilkan dalam tahun, bulan, dan hari ");
        System.out.println("=============================================");
        System.out.printf(" %d tahun\n %d bulan\n %d hari ", year, month, day);
    }
    static int year(int a) {
        int year = a / 365;
        return year;
    }
    static int month(int a) {
        int month = a % 365 / 30;
        return month;
    }
    static int day(int a) {
        int day = (a % 365) % 30;
        return day;
    }
}    

