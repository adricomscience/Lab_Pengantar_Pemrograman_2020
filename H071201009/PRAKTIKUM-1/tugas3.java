import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        int varjam = in.nextInt();
        int varkec = in.nextInt();

        double hasil = varjam*varkec/14.0;

        System.out.printf("%.3f",hasil);
    }
}