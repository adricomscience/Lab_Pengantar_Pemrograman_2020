import java.util.Scanner;
public class Nomor01 {
    
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            int a,b,c,d,e;
            int genap = 0;
            int ganjil = 0;
            int positif = 0;
            int negatif = 0;
            try {
                a = input.nextInt();
                b = input.nextInt();
                c = input.nextInt();
                d = input.nextInt();
                e = input.nextInt();
                System.out.println("Masukkan 5 Angka!");
            //a
            if(a <= 0) {
                if(a<0) {
                    negatif++;
                }
                else{
                    positif++;
                }
            }if (a % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
            //b
            if(b <= 0) {
                if(b<0) {
                    negatif++;
                }
                else{
                    positif++;
                }
            }if (b % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
            //c
            if(c <= 0) {
                if(b<0) {
                    negatif++;
                }
                else{
                    positif++;
                }
            }if (c % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
            //d
            if(d <= 0) {
                if(d<0) {
                    negatif++;
                }
                else{
                    positif++;
                }
            }if (d % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
            //e
            if(e <= 0) {
                if(e<0) {
                    negatif++;
                }
                else{
                    positif++;
                }
            }if (e % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
                System.out.printf("jumlah bilangan positif = %d\n", genap);
                System.out.printf("jumlah bilangan negatif = %d\n", ganjil);
                System.out.printf("jumlah bilangan ganjil = %d\n", positif);
                System.out.printf("jumlah bilangan genap = %d\n", negatif);
        }
        catch (Exception er) {
            System.out.printf("Input Tidak Valid");
        }
    }
} 
