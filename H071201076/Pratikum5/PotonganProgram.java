import java.util.Scanner;
import java.util.Random;

class PotonganProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        Random acak = new Random();
        int angka = 0;
        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                angka = acak.nextInt(10);
                str += Integer.toString(angka);
            }
            if (i != n-1){
                str += "-";
            }
        }
        return str;
    }

}