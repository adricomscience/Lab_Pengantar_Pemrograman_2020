import java.util.Scanner;
public class TP1 {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	int x1 = obj.nextInt();
    int y1 = obj.nextInt();
		while (x1 <= y1) {
			if (x1 < 0 && x1%2 == 0) {
				System.out.println(x1 + " genap negatif");
			}
			else if (x1 < 0 && x1%2 == -1) {
				System.out.println(x1 + " ganjil negatif");
			}
			else if (x1 > 0 && x1%2 == 0) {
				System.out.println(x1 + " genap positif");
			}
			else if (x1 > 0 && x1%2 == 1) {
				System.out.println(x1 + " ganjil positif");
			}
			else {
				System.out.println(x1 + " nol");
			}
  		x1++;
		}

	}
}