import java.util.Scanner;
public class TP2 {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	int x1 = obj.nextInt();
    int y1 = obj.nextInt();
    int reset = 0;
		for (int i = 1; i<=y1; i++) {
			if (i == 1) {
				System.out.print(i);
			}
			else if (reset == x1) {
				System.out.printf("\n" + i);
				reset=0;
			}
			else {
  				System.out.printf(" " + i);
  			}
  		reset++;
		}

	}
}