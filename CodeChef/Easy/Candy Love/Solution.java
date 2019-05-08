import java.util.Scanner;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T--> 0) {
            int N = scanner.nextInt();
            ArrayList<Integer> candies = new ArrayList<>();
            int totalCandies = 0;
            while(N-- > 0) {
                int candy = scanner.nextInt();
                candies.add(candy);
                totalCandies+=candy;
            }
            if (totalCandies%2 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scanner.close();        
    }
}