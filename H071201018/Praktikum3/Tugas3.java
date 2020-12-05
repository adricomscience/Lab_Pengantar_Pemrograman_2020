import java.util.Scanner;

class Tugas3{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
 		long a=0,b=1,c,i,n;
 		System.out.println("Masukan nilai n");
 		n = obj.nextInt();
 		System.out.print(a+" "+b);
    
 		for(i=2;i<n;++i){
  			c=a+b;
  			System.out.print(" "+c);
  			a=b;
  			b=c;
 		}
	}
}