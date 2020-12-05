import java.util.Scanner;

class Tugas5{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		float M;
		int a,h=0,m=0,s=0;
		
		M = obj.nextFloat();

		if(M>=0 && M<360){
			a = (int)(M*240);

			h = a / 3600;
			a = a % 3600;

			m = a / 60; 
			s = a % 60;

			h=h+6;

		if(h>24){
			h=h-24;
		}
		if((h>=6) && (h<12)){
			System.out.printf("Selamat Pagi");
		} else if((h>=12) && (h<16)){
			System.out.printf("Selamat Siang");
		} else if((h>=16) && (h<20)){
			System.out.printf("Selamat Sore");
		} else{
			System.out.printf("Selamat Malam");
		}

		System.out.println();
		System.out.printf("%02d",h);
		System.out.printf(":" + "%02d",m);
		System.out.printf(":" + "%02d",s);

		} else{
			System.out.println("Nilai M harus 0 <= M < 360");
		}
	}
}
		



