/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        int count = 0;
        while(t-->0){
            long n = scanner.nextLong();
            for(long i=5; n/i>=1; i*=5){
                count+=(int)n/i;
            }
            System.out.println(count);
            count=0;
        }
        scanner.close();
	}
}
