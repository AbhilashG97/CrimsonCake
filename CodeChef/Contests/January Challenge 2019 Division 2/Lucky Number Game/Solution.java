import java.util.Scanner;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-->0) {
            int N = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int size = N;
            ArrayList<Integer> numbers = new ArrayList<>();

            while(N-->0) {
                numbers.add(scanner.nextInt()); 
            }
            
        }

        scanner.close();
    }
}