import java.util.Scanner;

class Tugas2{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int x,y,i,j,k=0;

		System.out.println("Masukan nilai x");
		x = obj.nextInt();
		System.out.println("Masukan nilai y");
		y = obj.nextInt();

		if(x<y){
			for(i=1;i<=y;i++){
				for(j=1;j<=x;j++){
					k++;
					System.out.print(k+" ");
					if(k==y){
						return;
					}
				}
				System.out.println();
			}
		} else{
			System.out.print("Nilai y harus lebih besar dari nilai x");
		}
	}
}
