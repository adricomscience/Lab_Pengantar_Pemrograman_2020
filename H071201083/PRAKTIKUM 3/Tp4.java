import java.util.Scanner;

class TP4 {
    public static void main(String[] args) {
        Scanner tika = new Scanner(System.in);
       
        int $100=0,$50=0,$20=0,$10=0,$5=0,$2=0,$1=0;{
            System.out.println("Masukkan Harga Barang");
            int harga = tika.nextInt();
            System.out.println("Masukkan Uang");
            int uang = tika.nextInt();
            int kembalian = uang - harga;
            tika.close();
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
                $100++;
            } while(kembalian >= 50000){
                kembalian -= 50000;
                $50++;
            } while(kembalian >= 20000){
                kembalian -= 20000;
                $20++;
            } while(kembalian >= 10000){
                kembalian -= 10000;
                $10++;
            } while(kembalian >= 5000){
                kembalian -= 5000;
                $5++;
            } while(kembalian >= 2000){
                kembalian -= 2000;
                $2++;
            } while(kembalian >= 1000){
                kembalian -= 1000;
                $1++;
            }
            System.out.printf("\n%d uang Rp. 100.000" ,$100);
            System.out.printf("\n%d uang Rp. 50.000",$50 );
            System.out.printf("\n%d uang Rp. 20.000",$20);
            System.out.printf("\n%d uang Rp. 10.000",$10);
            System.out.printf("\n%d uang Rp. 5.000",$5);
            System.out.printf("\n%d uang Rp. 2.000",$2);
            System.out.printf("\n%d uang Rp. 1.000",$1);
            

            if(kembalian != 0){
                System.out.printf("sisa uang lain = Rp. %d ",kembalian);
            }
        } 
        }
    }
