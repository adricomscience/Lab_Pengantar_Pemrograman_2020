import java.util.Scanner;

public class Tambahan1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Masukkan Panjang Rusuk : ");
        int s = read.nextInt();
        int L = 6*s*s;
        System.out.print("Luas Permukaan Kubus : " + L);
    }
}