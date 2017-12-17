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
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long count = 0;  
        while(n-->0){
            long ti = scanner.nextLong();
            if(ti%k ==0){
                count++;
            } 
        }
        System.out.println(count);
        scanner.close();
	}
}