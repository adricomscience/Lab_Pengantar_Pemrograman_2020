import java.util.Scanner;
public class praktik4 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int panjang;
		System.out.println("panjang rusuk kubus   : ");
		panjang = input.nextInt();
		int luas = 6 * panjang * panjang;
		System.out.println("Luas permukaan kubus  : "+luas);
	}
}