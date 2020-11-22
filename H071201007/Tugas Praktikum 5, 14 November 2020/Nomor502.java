import java.util.Scanner;
import java.util.Random;
public class Nomor502 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }
    public static String generateSerial (int n, int m) {
        Random random = new Random();
        String str = new String();
        for (int a = 0; a <= n; a++) {
            for (int  b= 0; b <= m; b++) {
                str += random.nextInt(10);
            }
            if (a < n) {
                str += "-";
            }
        }
        return str;
}
}
