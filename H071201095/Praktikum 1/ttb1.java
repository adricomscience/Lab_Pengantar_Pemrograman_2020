import java.util.Scanner;

class ttb1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pR = scan.nextInt();

        int luas = 6*(pR*pR);

        System.out.print("Luas Permukaan Kubus : " + luas);
    }
}