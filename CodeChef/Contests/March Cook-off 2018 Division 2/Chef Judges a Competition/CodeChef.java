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
            int N = scanner.nextInt();
            int A[] = new int[N];
            int B[] = new int[N];
            int maxA = 1;
            int maxB = 1;
            int sumA = 0, sumB =0;
            for(int i=0; i<N; i++) {
                A[i] = scanner.nextInt();
                if(A[i] > maxA){
                    maxA = A[i];
                }
                sumA+=A[i];   
            }
            for(int i=0; i<N; i++) {
                B[i] = scanner.nextInt();
                if(B[i] > maxB){
                    maxB = B[i];
                }
                sumB+=B[i];
            }   
            if(sumA-maxA > sumB-maxB) {
                System.out.println("Bob");
            }else if(sumA-maxA < sumB-maxB) {
                System.out.println("Alice");
            }else{
                System.out.println("Draw");
            }
        }
        scanner.close();
	}
}
