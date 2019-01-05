import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-->0) {
            int N = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int[] numbers = new int[N];

            for(int i=0; i<N; i++) {
                numbers[i] = scanner.nextInt(); 
            }
        }
        
        scanner.close();
    }
}