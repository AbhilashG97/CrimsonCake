/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef{
	public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long n = scanner.nextLong();
            System.out.println((int)(Math.log(2*(double)n)/Math.log(2)));
        }
        scanner.close();
	}
}
