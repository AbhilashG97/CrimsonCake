// Problem link - https://codeforces.com/problemset/problem/1082/A

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int d = scanner.nextInt();       
            
            int a = 0;
            int N = 0;

            StringBuilder numbers = new StringBuilder();

            for(int i=1; i<n && a<y; i++) {
                a = 1 + (i-1)*d;
                numbers.append(a+","); 
            }
            
            String numberString = numbers.toString();
            System.out.println(numberString);

            if(numberString.contains(","+y+",")) {
                if(numberString.contains(","+x+",")) {
                    N = ((y-x)/d);
                } else {
                    N = ((y-1)/d);
                    int count = 0;
                    while(x>0) {
                        x-=d;
                        count++;
                    }
                    N+=count;
                }
            } else {
                N=-1;
            }
            System.out.println(N);
        }
        scanner.close();
    }
}