import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int totalLuck = 0;
        ArrayList<Integer> importantContests = new ArrayList<>();
        for(int i=0; i<contests.length; i++) {
            if(contests[i][1] == 1) {
                importantContests.add(contests[i][0]);   
            } else {
                totalLuck+=contests[i][0];
            }
        }
        Collections.sort(importantContests);
        Collections.reverse(importantContests);
        for(int i=0; i<importantContests.size(); i++) {
            if(i <= k-1) {
                totalLuck+=importantContests.get(i);
            } else {
                totalLuck-=importantContests.get(i);
            }
        }
        
        return totalLuck;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] contests = new int[n][2];

        for(int i=0; i<n; i++) {
            contests[i][0] = scanner.nextInt();
            contests[i][1] = scanner.nextInt();
        }
        
        System.out.println(luckBalance(k, contests));

        scanner.close();
    }
}
