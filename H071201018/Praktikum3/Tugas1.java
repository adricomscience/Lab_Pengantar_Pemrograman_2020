import java.util.Scanner;

class Tugas1{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int x,y,i;
		System.out.println("Masukan nilai x");
		x = obj.nextInt();
		System.out.println("Masukan nilai y");
		y = obj.nextInt();
		if(x<y){
			for(i=x; i<=y; i++){
				if(i > 0){
					if(i % 2 == 0){
						System.out.println(i+" genap positif");
					} else{
						System.out.println(i+" ganjil positif");
					}
				} else if(i < 0){
					if(i % 2 == 0 ){
						System.out.println(i+" genap negatif");
					} else{
						System.out.println(i+" ganjil negatif");
					}
				} else{
					System.out.println(i+" nol");
				}
			}
		}else{
			for(i=y; i<=x; i++){
				if(i > 0){
					if(i % 2 == 0){
						System.out.println(i+" genap positif");
					} else{
						System.out.println(i+" ganjil positif");
					}
				} else if(i < 0){
					if(i % 2 == 0 ){
						System.out.println(i+" genap negatif");
					} else{
						System.out.println(i+" ganjil negatif");
					}
				} else{
					System.out.println(i+" nol");
				}
			}
		}

	}
}
