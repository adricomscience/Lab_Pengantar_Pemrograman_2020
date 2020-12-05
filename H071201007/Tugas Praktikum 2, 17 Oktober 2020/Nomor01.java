import java.util.Scanner;

public class Nomor01 {
    public static void main(String[] args ) {
        int a,b,c,d,e,genap=0,ganjil=0,positif=0,negatif=0;
        Scanner input  = new Scanner(System.in);

        try {
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            e = input.nextInt();

            if (a>=0) {
                if (a>0)
                    positif++;
                if (a%2==0)
                    genap++;
                else
                    ganjil++;
            }
            else
            {
                negatif++;
                if (a%2==0)
                    genap++;
                else
                    ganjil++;
            }
            if (b>=0) {
                if (b>0)
                    positif++;
                if (b%2==0)
                    genap++;
                else
                    ganjil++;
            }
            else
            {
                negatif++;
                if (b%2==0)
                    genap++;
                else
                    ganjil++;
            }
            if (c>=0) {
                if (c>0)
                    positif++;
                if (c%2==0)
                    genap++;
                else
                    ganjil++;
            }
            else
            {
                negatif++;
                if (c%2==0)
                    genap++;
                else
                    ganjil++;
            }
            if (d>=0) {
                if (d>0)
                    positif++;
                if (d%2==0)
                    genap++;
                else
                    ganjil++;
            }
            else
            {
                negatif++;
                if (d%2==0)
                    genap++;
                else
                    ganjil++;
            }
            if (e>=0) {
                if (e>0)
                    positif++;
                if (e%2==0)
                    genap++;
                else
                    ganjil++;
            }
            else
            {
                negatif++;
                if (e%2==0)
                    genap++;
                else
                    ganjil++;
            }
        
            System.out.printf("Total bilangan genap   : %d\n " ,genap );
            System.out.printf("Total bilangan ganjil  : %d\n " ,ganjil );
            System.out.printf("Total bilangan positif : %d\n " ,positif );
            System.out.printf("Total bilangan negatif : %d\n " ,negatif );
        }
        catch (Exception er ) {
            System.out.print(" inputan tidak valid ");
        }
            
    }

}
        