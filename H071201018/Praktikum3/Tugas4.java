import java.util.Scanner;

class Tugas4{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int x,y,z,u100=0,u50=0,u20=0,u10=0,u5=0,u2=0,u1=0;

		System.out.println("Masukan jumlah harga barang");
		x = obj.nextInt();
		System.out.println("Masukan jumlah uang anda");
		y = obj.nextInt();

		z = y - x;

		if(z>=100000){
			u100= z/100000;
			z = z%100000;
		}
		if(z>=50000){
			u50= z/50000;
			z = z%50000;
		}
		if(z>=20000){
			u20= z/20000;
			z = z%20000;
		}
		if(z>=10000){
			u10= z/10000;
			z = z%10000;
		}
		if(z>=5000){
			u5= z/5000;
			z = z%5000;
		}
		if(z>=2000){
			u2= z/2000;
			z = z%2000;
		}
		if(z>=1000){
			u1= z/1000;
			z = z%1000;
		}

		System.out.println(u100+" uang Rp. 100.000");
		System.out.println(u50+" uang Rp. 50.000");
		System.out.println(u20+" uang Rp. 20.000");
		System.out.println(u10+" uang Rp. 10.000");
		System.out.println(u5+" uang Rp. 5.000");
		System.out.println(u2+" uang Rp. 2.000");
		System.out.println(u1+" uang Rp. 1.000");
	}
}
