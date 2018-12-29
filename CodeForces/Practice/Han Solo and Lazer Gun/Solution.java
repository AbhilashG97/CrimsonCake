import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int xO = scanner.nextInt();
        int yO = scanner.nextInt();

        int[] coordinates = new int[2*n];

        for(int i=0; i<n; i++) {
            coordinates[i] = scanner.nextInt();
        }
        
        scanner.close();
    }
}