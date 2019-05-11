import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
        while(t-->0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int boxes[] = new int[M];
            int maxCapacity[] = new int[M];
            int firstMax = 0, secondMax = 0;
            for(int i=0; i< M; i++) {
                boxes[i] = scanner.nextInt();
            }

            for(int j=0; j<M; j++) {
                maxCapacity[j] = scanner.nextInt();
            }

            Arrays.sort(maxCapacity);

            if(maxCapacity.length == 1) {
                if(maxCapacity[0] >= N) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else {
                if(maxCapacity[M-1] + maxCapacity[M-2] >= N) {
                    System.out.println("YES");
                } else {
                System.out.println("NO");
            }
        }

        }
		scanner.close();
	}
}
