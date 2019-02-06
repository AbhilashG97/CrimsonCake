import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int numberOfToys = 0;
        for(int i : prices) {
            if(i <= k) {
                numberOfToys++;
                k-=i;
            } else {
                break;
            }   
        }
        return numberOfToys;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] prices = new int[n];

        for(int i = 0; i<n; i++) {
            prices[i] = scanner.nextInt();
        }

        System.out.println(maximumToys(prices, k));
        scanner.close();
    }
}
