import java.uitl.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if(n==1) {
            System.out.println("a");
        } else if(n==2) {
            System.out.println("aa");
        } else if (n==3) {
            System.out.println("aab");
        } else {
            
        }

        scanner.close();
    }
}