import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int B = scanner.nextInt();

        int[] sequence  = new int[n];

        for(int i=0; i<n; i++) {
            sequence[i] = scanner.nextInt();
        }
        
        scanner.close();
    }
}