/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int firstDigit=0, lastDigit=0;
        while(T-->0){
            int N = scanner.nextInt();
            firstDigit = Character.getNumericValue((Integer.toString(N)).charAt(0)) ;
            lastDigit = N%10;
            System.out.println(firstDigit + lastDigit);
        }
        scanner.close();
	}
}
