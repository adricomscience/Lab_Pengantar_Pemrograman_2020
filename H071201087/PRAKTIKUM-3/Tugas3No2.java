import java.util.Scanner;
public class Tugas3No2 {

	public static void main(String[] args) {
	Scanner bob = new Scanner(System.in);
	int x1 = bob.nextInt();
    int y1 = bob.nextInt();
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