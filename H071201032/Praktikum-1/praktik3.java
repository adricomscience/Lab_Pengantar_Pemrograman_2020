import java.util.Scanner;
public class praktik3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Ketinggian Menara    : ");
		int h = input.nextInt();
		System.out.println("Ujung belakang kapal : ");
		int a = input.nextInt();
		System.out.println("Ujung depan kapal    : ");
		int b = input.nextInt();
		double Xp;
		double Xy;

		Xp = Math.tan(Math.toRadians(a));
		Xy = Math.tan(Math.toRadians(b));

		double Pk;
		Pk = (Xp * h) - (Xy * h);
	}
}