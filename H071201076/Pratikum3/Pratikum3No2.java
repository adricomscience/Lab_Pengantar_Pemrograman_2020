import java.util.Scanner;
public class Pratikum3No2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        for (int i = 1; i <= y; i++) {
            if (i%x == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }

        }

    }
}
