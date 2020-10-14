import java.util.Scanner;
class BensinLiter
{
	public static void main(String[] args) 
	{
		int a, b;
		double c;
		Scanner obj = new Scanner(System.in);

		System.out.print("Masukan waktu tempuh (dalam jam) = ");
		a = obj.nextInt();
		System.out.print("Masukan kecepatan rata rata (dalam km/jam) = ");
		b = obj.nextInt();

		c = b * a / 14.0;

		System.out.printf("Bensin yang Digunakan = " + "%.3f",c);

	}
}