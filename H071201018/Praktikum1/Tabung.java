import java.util.Scanner;
class Tabung
{
	public static void main(String[] args)
	{
		float d, t, v, phi = 3.1415f;
		Scanner obj = new Scanner(System.in);

		System.out.print("Masukan panjang diameter & tinggi tabung = ");
		d = obj.nextInt();
		t = obj.nextInt();

		v = phi * d * d * t / 4;
		System.out.printf("Volume tabung = " + "%.2f",v);
	}


}