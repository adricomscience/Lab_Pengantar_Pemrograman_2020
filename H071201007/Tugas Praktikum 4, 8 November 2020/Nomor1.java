import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array = new int [n];
        for ( int i=0;i<=n;i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (array[i] % array[j] != 0 && array[j] % array[i] != 0)
					System.out.println(array[i] + " " + array[j]);
			}
		}

    }
}