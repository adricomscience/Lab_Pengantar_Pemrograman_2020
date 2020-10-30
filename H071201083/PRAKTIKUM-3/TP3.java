import java.util.Scanner;
public class TP3 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int a = 0;
      int b = 1;S
      int next = 0;
      System.out.print(a);
      System.out.printf(" " + b);
      for (int count = 2; count<n; count++) {
        next=a +b ;
        System.out.printf(" " + next);
        a = b;
        b = next;
      }
    }
}