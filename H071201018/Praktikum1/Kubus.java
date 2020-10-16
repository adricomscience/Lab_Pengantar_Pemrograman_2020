import java.util.Scanner;
class Kubus
{
	public static void main(String[] args)
	{
		int a, l, L;
		Scanner obj = new Scanner(System.in);

		System.out.print("Masukan panjang rusuk = ");
		a = obj.nextInt();

		l = a * a;
		L = l * 6;

		System.out.printf("Luas kubus = " + L);
	}


}