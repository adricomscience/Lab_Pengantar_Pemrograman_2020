import java.util.Scanner;

public class tb2 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.printf (" Input Nilai :");
		int x = 140153;
		
		int jam, menit, detik;
		jam = x/3600;
		x = x - (jam*3600);
		menit = x/60 ;
		detik = x - menit*60;
		
		System.out.println(jam+ ":" +menit+ ":" +detik);
	}
}