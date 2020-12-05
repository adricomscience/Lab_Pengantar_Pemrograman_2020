import java.util.Scanner;
public class Pratikum3No3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a+b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
    
}
