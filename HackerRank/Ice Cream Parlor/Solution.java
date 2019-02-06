import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, int[] arr) {
        int[] result = new int[2];
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] + arr[i] == m) {
                    result[0] = i+1;
                    result[1] = j+1;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[] cost = new int[n];
            for(int i=0; i<n; i++) {
                cost[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(icecreamParlor(m, cost)));   
        }
        scanner.close();
    }
}
