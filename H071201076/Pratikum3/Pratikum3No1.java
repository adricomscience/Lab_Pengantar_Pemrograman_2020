import java.util.Scanner;

public class Pratikum3No1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        if (y > x) {
            for (int i = x; i <= y; i++) {
                if (i%2 == 0) {
                    if (i > 0) {
                        System.out.println(i + " genap positif");
                    } else if (i < 0) {
                        System.out.println(i + " genap negatif");
                    } else {
                        System.out.println(i + " nol");
                    }
                } else {
                    if (i > 0) {
                        System.out.println(i + " ganjil positif");
                    } else if (i < 0) {
                        System.out.println(i + " ganjil negatif");
                    }
                }
            }
        } else if (x > y) {
            for (int i = y; i <= x; i++) {
                if (i%2 == 0) {
                    if (i > 0) {
                        System.out.println(i + " genap positif");
                    } else if (i < 0) {
                        System.out.println(i + " genap negatif");
                    } else {
                        System.out.println(i + " nol");
                    }
                } else {
                    if (i > 0) {
                        System.out.println(i + " ganjil positif");
                    } else if (i < 0) {
                        System.out.println(i + " ganjil negatif");
                    } 
                }   
            }
        }
    }
}
