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
        String stringNumber = null, reverseString = null;
        while(T-->0){
            int N = scanner.nextInt();
            stringNumber = Integer.toString(N);
            StringBuilder stringBuilder = new StringBuilder(stringNumber);
            reverseString = stringBuilder.reverse().toString();
            System.out.println(Integer.valueOf(reverseString));
        }
        scanner.close();
	}
}
