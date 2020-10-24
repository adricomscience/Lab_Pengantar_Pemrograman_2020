import java.util.Scanner;

class Tugas02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int l1=0, l2=0;
		double s, p, l, a, t, r, d1, d2, hasil;
		boolean validInput = false;

		System.out.println("** Menu **");
		System.out.println("1. Mencari Luas bangun Datar");
		System.out.println("2. Mencari Volume Bangun Ruang");
		System.out.println(" ");
		System.out.println("Input angka sesuai dengan Menu Yang diinginkan :");

		while(!validInput) {
    		try {
    			l1 = input.nextInt();
        		validInput = true;
    		} catch(Exception e) {
        		System.out.println("Input tidak sah");
        		return;
        	}

		if(l1 == 1){
			System.out.println("** Pilih Bangun Datar **");
			System.out.println("1. Persegi ");
			System.out.println("2. Persegi Panjang ");
			System.out.println("3. Segitiga ");
			System.out.println("4. Lingkaran ");
			System.out.println("5. Jajar Genjang ");
			System.out.println("6. Trapesium ");
			System.out.println("7. Belah Ketupat ");
			System.out.println("8. Layang-Layang ");
			System.out.println();
			System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
			
			validInput = false;
			while(!validInput) {
    			try {
    				l2 = input.nextInt();
        			validInput = true;
    			} catch(Exception e) {
        			System.out.println("Input tidak sah");
        			return;
	        	}
	        }

			if(l2 == 1){
				System.out.println("Input Sisi");
				s = input.nextInt();

				hasil = s*s;
				System.out.print("Luas Persegi = "+hasil);
			} else if(l2 ==2){
				System.out.println("Input Panjang");
				p = input.nextInt();
				System.out.println("Input Lebar");
				l = input.nextInt();

				hasil = p*l;
				System.out.print("Luas Persegi Panjang = "+hasil);
			} else if(l2 ==3){
				System.out.println("Input Alas");
				a = input.nextInt();
				System.out.println("Input Tinggi");
				t = input.nextInt();

				hasil = a*t;
				System.out.print("Luas Segitiga = "+hasil);
			} else if(l2 ==4){
				System.out.println("Input Jari Jari");
				r = input.nextInt();

				hasil = Math.PI*r*r;
				System.out.print("Luas Lingkaran = "+hasil);
			} else if(l2 ==5){
				System.out.println("Input Alas");
				a = input.nextInt();
				System.out.println("Input Tinggi");
				t = input.nextInt();

				hasil = a*t;
				System.out.print("Luas Jajar Genjang = "+hasil);
			} else if(l2 ==6){
				System.out.println("Input Jumlah Sisi Sejajar");
				s = input.nextInt();
				System.out.println("Input Tinggi");
				t = input.nextInt();

				hasil = s*t/2;
				System.out.print("Luas Trapesium = "+hasil);
			} else if(l2 ==7){
				System.out.println("Input Diagonal 1");
				d1 = input.nextInt();
				System.out.println("Input Diagonal 2");
				d2 = input.nextInt();

				hasil = d1*d2/2;
				System.out.print("Luas Belah Ketupat = "+hasil);
			} else if(l2 ==8){
				System.out.println("Input Diagonal 1");
				d1 = input.nextInt();
				System.out.println("Input Diagonal 2");
				d2 = input.nextInt();

				hasil = d1*d2/2;
				System.out.print("Luas Layang-Layang = "+hasil);
			} else{
				System.out.println("Input tidak sah");
			}
		} else if(l1 == 2){
			System.out.println("** Pilih Bangun Ruang **");
			System.out.println("1. Kubus ");
			System.out.println("2. Balok ");
			System.out.println("3. Prisma Segitiga ");
			System.out.println("4. Limas Segiempat ");
			System.out.println("5. Limas Segitiga ");
			System.out.println("6. Tabung ");
			System.out.println("7. Kerucut ");
			System.out.println("8. Bola ");
			System.out.println();
			System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
			
			validInput = false;	
			while(!validInput) {
	    		try {
	   				l2 = input.nextInt();
	       			validInput = true;
	   			} catch(Exception e) {
	       			System.out.println("Input tidak sah");
        			return;
	        	}

			if(l2 == 1){
				System.out.println("Input Sisi");
				s = input.nextInt();

				hasil = s*s*s;
				System.out.print("Volume Kubus = "+hasil);
			} else if(l2 ==2){
				System.out.println("Input Panjang");
				p = input.nextInt();
				System.out.println("Input Lebar");
				l = input.nextInt();
				System.out.println("Volume Tinggi");
				t = input.nextInt();

				hasil = p*l*t;
				System.out.print("Luas Balok = "+hasil);
			} else if(l2 ==3){
				System.out.println("Input Luas Alas");
				a = input.nextInt();
				System.out.println("Input Tinggi");
				t = input.nextInt();

				hasil = a*t;
				System.out.print("Volume Prisma Segitiga = "+hasil);
			} else if(l2 ==4){
				System.out.println("Input Panjang");
				p = input.nextInt();
				System.out.println("Input Lebar");
				l = input.nextInt();
				System.out.println("Volume Tinggi");
				t = input.nextInt();

				hasil = p*l*t/3;
				System.out.print("Volume Limas Segiempat = "+hasil);
			} else if(l2 ==5){
				System.out.println("Input Luas Alas");
				a = input.nextInt();
				System.out.println("Input Tinggi");
				t = input.nextInt();

				hasil = a*t/3;
				System.out.print("Volume Limas Segitiga = "+hasil);
			} else if(l2 ==6){
				System.out.println("Input Jari Jari");
				r = input.nextInt();
				System.out.println("Input Tinggi");
				t = input.nextInt();

				hasil = Math.PI*r*r*t;
				System.out.print("Volume Tabung = "+hasil);
			} else if(l2 ==7){
				System.out.println("Input Jari Jari");
				r = input.nextInt();
				System.out.println("Input Tinggi");
				t = input.nextInt();

				hasil = Math.PI*r*r*t/3;
				System.out.print("Volume Kerucut = "+hasil);
			} else if(l2 ==8){
				System.out.println("Input Jari Jari;");
				r = input.nextInt();

				hasil = 4/3*Math.PI*r*r*r;
				System.out.print("Volume Bola = "+hasil);
			} else{
				System.out.println("Input tidak sah");
				}
			}
		} else {
				System.out.println("Input tidak sah");
			}
		}
	}
}

	


		




