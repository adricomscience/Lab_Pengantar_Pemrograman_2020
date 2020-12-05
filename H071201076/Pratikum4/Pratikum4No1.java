import java.util.Scanner;

public class Pratikum4No1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] angka = new int[n];
        int bagihabis = 0;

        for (int i = 0; i < angka.length; i++) {
            angka[i] = read.nextInt();
        }
        for (int i = 0; i < angka.length; i++) {
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[i] > angka[j]) {
                    for (int k = 1; k <= angka[i]; k++) {
                        if (angka[i]%k == 0 && angka[j]%k == 0) {
                            bagihabis++;
                        }
                    }
                } else if (angka[i] < angka[j]) {
                    for (int k = 1; k <= angka[j]; k++) {
                        if (angka[i]%k == 0 && angka[j]%k == 0) {
                            bagihabis++;
                        }
                    }
                }
                if (bagihabis == 1) {
                    System.out.printf("%d %d \n", angka[i], angka[j]);
                }
                bagihabis = 0;
            }
        }
    }   
}