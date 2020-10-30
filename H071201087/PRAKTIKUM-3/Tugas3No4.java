import java.util.Scanner;

public class Tugas3No4{
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
       
        int rp100=0,rp50=0,rp20=0,rp10=0,rp5=0,rp2=0,rp1=0;{
            System.out.println("Masukkan Harga Barang");
        int harga = bob.nextInt();
            System.out.println("Masukkan Uang");
        int uang = bob.nextInt();
        int kembalian = uang - harga;
            bob.close();
            if(harga < 0){
                System.out.println("Invalid Input");
            }
            if(kembalian < 0){
                kembalian *= -1;
                System.out.printf("uang anda kurang Rp. %d",kembalian);
                return;
            }
            while(kembalian >= 100000){
                kembalian -= 100000;
                rp100++;
            } while(kembalian >= 50000){
                kembalian -= 50000;
                rp50++;
            } while(kembalian >= 20000){
                kembalian -= 20000;
                rp20++;
            } while(kembalian >= 10000){
                kembalian -= 10000;
                rp10++;
            } while(kembalian >= 5000){
                kembalian -= 5000;
                rp5++;
            } while(kembalian >= 2000){
                kembalian -= 2000;
                rp2++;
            } while(kembalian >= 1000){
                kembalian -= 1000;
                rp1++;
            }
            System.out.printf("\n%d uang Rp. 100.000" ,rp100);
            System.out.printf("\n%d uang Rp. 50.000",rp50 );
            System.out.printf("\n%d uang Rp. 20.000",rp20);
            System.out.printf("\n%d uang Rp. 10.000",rp10);
            System.out.printf("\n%d uang Rp. 5.000",rp5);
            System.out.printf("\n%d uang Rp. 2.000",rp2);
            System.out.printf("\n%d uang Rp. 1.000",rp1);
           
            if(kembalian != 0){
                System.out.printf("sisa uang lain = Rp. %d ",kembalian);    
             }
         }
    }
} 
     
    
