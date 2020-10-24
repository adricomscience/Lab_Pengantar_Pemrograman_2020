import java.util.Scanner;

class Tugas01{
	public static void main(String[] args){
		int a=0, b=0, c=0, d=0, f=0, genap=0, ganjil=0, p=0, n=0, nol=0;

		Scanner input = new Scanner(System.in);
		System.out.println("Masukan 5 angka");

		boolean validInput = false;
		

		while(!validInput) {
    		try {
    			a = input.nextInt();
				b = input.nextInt();
				c = input.nextInt();
				d = input.nextInt();
				f = input.nextInt();
        	validInput = true;
    		} catch(Exception e) {
        		System.out.println("Input tidak sah");
        		return;
        	}
        }
		
			//a
			if (a < 0){
				n = n + 1;
			} else if (a == 0){
				nol = nol + 1;
			} else{
				p = p + 1;
			}

			if(a % 2 == 1){
				ganjil = ganjil + 1;
			} else if(a == 0){
				nol = nol;
			}else {
				genap = genap + 1;
			}
			
			
			//b
			if (b < 0){
				n = n + 1;
			} else if (b == 0){
				nol = nol + 1;
			} else{
				p = p + 1;
			}

			if(b % 2 == 1){
				ganjil = ganjil + 1;
			} else if(b == 0){
				nol = nol;
			} else {
				genap = genap + 1;
			}
					
			//c
			if (c < 0){
				n = n + 1;
			} else if (c == 0){
				nol = nol + 1;
			} else{
				p = p + 1;
			}

			if(c % 2 == 1){
				ganjil = ganjil + 1;
			} else if(c == 0){
				nol = nol;
			} else {
				genap = genap + 1;
			}
					
			//d
			if (d < 0){
				n = n + 1;
			} else if (d == 0){
				nol = nol + 1;
			} else{
				p = p + 1;
			}

			if(d % 2 == 1){
				ganjil = ganjil + 1;
			} else if(d == 0){
				nol = nol;
			} else {
				genap = genap + 1;
			}
					
			//f
			if (f < 0){
				n = n + 1;
			} else if (f == 0){
				nol = nol + 1;
			} else{
				p = p + 1;
			}

			if(f % 2 == 1){
				ganjil = ganjil + 1;
			} else if(f == 0){
				nol = nol;
			} 
			else {
				genap = genap + 1;
			}
			
			System.out.println(genap + " Angka Genap");
			System.out.println(ganjil + " Angka Ganjil");
			System.out.println(p + " Angka Positif");
			System.out.println(n + " Angka Negatif");
		}
	}

