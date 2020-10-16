import java.util.Scanner;
public class LuasKubus {
    public static void main(String[] args) {
        int p;
        int l;
        
        Scanner o=new Scanner(System.in);
        System.out.println("masukkan panjang rusuk");
         p = o.nextInt();
         

         l= 6*p*p;
         System.out.println("luas permukaan = "+ l );
    
    }


    
}
