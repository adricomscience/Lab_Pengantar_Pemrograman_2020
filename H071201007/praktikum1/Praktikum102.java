import java.util.Scanner;

class Praktikum102 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jam,jam1,menit,menit1,detik,totaldetik;
    totaldetik = input.nextInt();

     jam = totaldetik/3600;
     jam1 =  totaldetik%3600;
     menit = jam1/60;
     menit1 = jam1%60;
     detik = menit1;

    System.out.print(+jam+ " jam : " + menit+ " menit  : " + detik+ " detik "  );
    }
}
