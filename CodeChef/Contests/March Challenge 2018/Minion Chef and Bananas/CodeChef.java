/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef {
	public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0) {
            // Get inputs 
            int N = scanner.nextInt();
            int H = scanner.nextInt();
            int bananaPiles[] = new int[N];
            for(int i=0; i<N; i++) {
                bananaPiles[i] = scanner.nextInt();
            }
        }
        scanner.close();
	}
}
