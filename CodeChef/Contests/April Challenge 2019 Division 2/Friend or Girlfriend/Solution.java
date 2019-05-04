import java.util.Scanner;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T--> 0) {
            int N = scanner.nextInt();
            scanner.nextLine();
            String input = scanner.nextLine();
            char X = scanner.next().charAt(0);

            int count = 0;

            if(input.contains('X')) {
                count++;
            }
            
            

        }
        scanner.close();
    }
}