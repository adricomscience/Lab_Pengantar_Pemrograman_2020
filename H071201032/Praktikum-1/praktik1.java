import java.util.Scanner;
public class praktik1 {
	public static void(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("waktu tempuh   : ");
		System.out.println("Jarak tempuh   : ");
		int waktu = input.nextInt();
		int jarak = input.nextInt();
		float bensin;
		bensin = (waktu*jarak)/14f;
		System.out.println("Bensin yang digunakan") + String.format("%.3f", bensin + "L");
	}
}