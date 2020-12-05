import java.util.Scanner;
public class Tugas3No3 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int bob = scan.nextInt();
      int a = 0;
      int b = 1;
      int next = 0;
      System.out.print(a);
      System.out.printf(" " + b);
      
      for (int count = 2; count<bob; count++) {
        next=a+b ;
        System.out.printf(" " + next);
        a = b;
        b = next;
      }
    }
}