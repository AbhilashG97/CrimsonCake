import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        boolean flag = false;
        int count[] = new int[6];
        count[0] = -1;
        for(int i=0; i<n; i++) {
            count[ar[i]]++;
        }
        int maxValue = 0, maxIndex = 1;
        for(int j=1; j<count.length; j++) {
            if(count[j] > maxValue) {
                maxValue = count[j];
                maxIndex = j;
            }
        }
        
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
