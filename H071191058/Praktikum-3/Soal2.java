import java.util.*;
public class Soal2{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("masukan nilai");
        
        int x = n.nextInt();
        int y = n.nextInt();

        for (int i = 1; i <= y; i++){
            System.out.print(i + " ");
            if (i % x == 0){
                System.out.println();        
            }
        }
    }
}