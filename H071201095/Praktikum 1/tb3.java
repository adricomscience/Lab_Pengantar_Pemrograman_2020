import java.util.Scanner;

public class tb3 {
	public static void main(String[] args ){
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Masukkan Ketinggian Menara\t : ");
		int h = scan.nextInt();
		
		System.out.print("Masukkan Nilai sudut elevasi belakang kapal\t : ");
		int a =  scan.nextInt();
		
		System.out.print("Masukkan Nilai sudut elevasi depan kapal\t : ");
		int  b = scan.nextInt();
		
        scan.close();
        
		double panjangkapal = ((Math.tan(Math.toRadians(a))) *h ) - ((Math.tan(Math.toRadians(b)))*h);
		
		System.out.printf("Panjang Kapal adalah  : %.1f M" , panjangkapal);
		
	}
}		