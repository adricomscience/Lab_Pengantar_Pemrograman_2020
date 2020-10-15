import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        
        int h,a,b;

        Scanner x = new Scanner (System.in);

        System.out.println("Tinggi menara ");
        h = x.nextInt();
        System.out.println("Sudut Elevasi Belakang ");
        a = x.nextInt();
        System.out.println("sudut Elevasi Depan");
        b = x.nextInt();


        float panjang1,panjang2;

        panjang1= (float) (Math.tan(Math.toRadians(b))*h);
        panjang2 =(float) (Math.tan(Math.toRadians(a))*h);

        float panjang = panjang2 - panjang1;
        System.out.printf("panjangnya adalah = " + "%.1f m",panjang);

        
        
    }
    
}
