import java.util.Scanner;

public class tb1 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		double efisiensi = 14 ;
		
		System.out.printf( "Waktu Tempuh\t:");
		int WaktuTempu = scan.nextInt();
		
		System.out.printf("percepatan\t:");
		int percepatan = scan.nextInt();
		
		double hasil = (percepatan*WaktuTempu)/efisiensi ;
		
		System.out.printf("Bensin yang digunakan %.3f" , hasil ) ;
		
	}
	
}