import java.util.Scanner;
class DetikkeJam
{
	public static void main(String[] args) 
	{
		int d, j, m, S, s;
		Scanner obj = new Scanner(System.in);

		System.out.print("Masukan jumlah detik = ");
		d = obj.nextInt();
		j = d / 3600;
		S = d % 3600;

		m = S / 60; 
		s = S % 60;

		System.out.printf(d + " detik = " + "%02d",j);
		System.out.printf(":" + "%02d",s);
	}
}