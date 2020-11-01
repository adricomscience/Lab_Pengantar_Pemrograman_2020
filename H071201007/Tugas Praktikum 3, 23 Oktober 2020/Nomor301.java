import java.util.Scanner;

public class Nomor301 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            int X = input.nextInt();
            int Y = input.nextInt();

            for(int i = X<=Y? X:Y; i<=(X<=Y? Y:X); i++){
                if (i<=0) 
                {
                    if (i==0)
                        System.out.printf("%d Bilangan Nol\n", i);
                    else if (i%2==0)
                        System.out.printf("%d Bilangan genap negatif \n ", i);
                    else 
                        System.out.printf("%d Bilangan ganjil negatif\n ", i);  
                }       
                else
                {
                    if(i%2==0)
                        System.out.printf("%d  Bilangan genap positif\n ", i);
                    else
                        System.out.printf(" %d Bilangan ganjil positif\n ", i);
                }
            }
        }
        catch (Exception er) {
            System.out.println("Nilai harus bilangan bulat");
        }
    }
}
