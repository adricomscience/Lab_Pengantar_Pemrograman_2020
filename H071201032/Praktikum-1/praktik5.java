import java.util.Scanner;
public class praktik5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double diam;
		double tinggi;
		diam = input.nextFloat();
		tinggi = input.nextFloat();
		phi = 3.14159;
		double r;
		r = diam/2;
		double volume;
		volume = (r*r*phi*tinggi);
		System.out.printf("total volume : " + "%.2f", volume);
	}
}
