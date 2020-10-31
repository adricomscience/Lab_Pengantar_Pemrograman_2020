import java.util.Scanner;
public class Nomor3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nilai n");
        int n = input.nextInt();
        int nilai1 = 0, nilai2= 1;
        for (int i = 0;i < n; i++) {    
            System.out.print(nilai1+" ");
            int a = nilai1 + nilai2;       
            nilai1 = nilai2;               
            nilai2 = a;                    
        }


    }
}