// https://codeforces.com/contest/1163/problem/A

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if(n == m) {
            System.out.println("0");
            System.exit(0);
        }

        if (m == 0) {
            System.out.println("1");
            System.exit(0);
        }

        int totalGroups = n/(n-m);

        if((n%(n-m)) > 0) {
            totalGroups++;
        }

        System.out.println(totalGroups);

        scanner.close();
    }
}