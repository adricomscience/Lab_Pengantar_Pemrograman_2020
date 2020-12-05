import java.util.Scanner;

public class Pratikum5No1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int FPB = cariFPB(a, b);
        System.out.printf("FPB dari %d dan %d = %d\n", a, b, FPB);
    }

    public static int cariFPB(int angka1, int angka2) {
        int fpb = 1;
        for (int i = 1; i <= angka1; i++) {
            if (angka1%i == 0 && angka2%i == 0) {
                fpb = i;
            }
        }
        return fpb;
    }
}