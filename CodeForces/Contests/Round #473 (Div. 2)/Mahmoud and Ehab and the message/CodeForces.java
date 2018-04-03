/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeForces {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        String[] words = new String[n]; 
        String[] message = new String[m];
        int[] cost = new int[n];
        int x = 0;
        int[][] groupWordIndices = null;

        for(int i=0; i<n; i++) {
            words[i] = scanner.next();
        }

        for(int j=0; j<n; j++) {
            cost[j] = scanner.nextInt();
        }


        // TODO : Modify 
        for(int z=0; z<k; z++) {
            x = scanner.nextInt();
            
        }

        for(int a=0; a<m; a++) {
            message[a] = scanner.next();
        }

        scanner.close();
	}
}
