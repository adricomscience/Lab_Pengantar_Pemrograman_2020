import java.util.Scanner;
public class Tugas3No1 {

	public static void main(String[] args) {
	Scanner bob = new Scanner(System.in);
	int x1 = bob.nextInt();
    int y1 = bob.nextInt();
		while (x1 <= y1) {
			if (x1 < 0 && x1%2 == 0) {
				System.out.println(x1 + " genap negatif");
			}
			else if (x1<0 && x1%2==-1) {
				System.out.println(x1 + " ganjil negatif");
			}
			else if (x1>0 && x1%2==0) {
				System.out.println(x1 + " genap positif");
			}
			else if (x1>0 && x1%2==1) {
				System.out.println(x1 + " ganjil positif");
			}
			else {
				System.out.println(x1 + " nol");
			}
  		x1++;
		}
	}
}