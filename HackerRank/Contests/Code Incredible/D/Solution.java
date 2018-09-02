import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int oddNumber = 1, j=0;
        for(int i=0; i<(n/2)+1; i++) {

            for(int z=0; z<(n-oddNumber)/2; z++) {
                System.out.print("*");
            }
            for(j=0; j<oddNumber; j++) {
                System.out.print("D");
            }
            for(int x=0; x<(n-oddNumber)/2; x++) {
                System.out.print("*");
            }
            System.out.println();
            j=0;
            oddNumber+=2;
        }
        oddNumber-=4;
        int k=0;
        for(int i = (n/2)+1; i<n; i++) {

            for(int z=0; z<(n-oddNumber)/2; z++) {
                System.out.print("*");
            }

            for(k=0; k<oddNumber; k++) {
                System.out.print("D");
            }

            for(int x=0; x<(n-oddNumber)/2; x++) {
                System.out.print("*");
            }
            k=0;
            oddNumber-=2;
            System.out.println();
        }
        scanner.close();
    }
}