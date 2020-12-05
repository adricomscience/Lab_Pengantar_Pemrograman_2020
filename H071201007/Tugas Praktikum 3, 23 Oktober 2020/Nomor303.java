import java.util.Scanner;

public class Nomor303 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            float n,i=0,j=1,angka;
            n = input.nextFloat();
            System.out.print(i+" "+j);
            for(int count = 2; count<n; count++)
            {
                angka = i+j;
                System.out.print(" "+angka);
                i=j;
                j=angka;
            }
        
        
    }
}
