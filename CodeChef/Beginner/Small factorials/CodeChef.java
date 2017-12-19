/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{   

    public static void getFactorial(int number){
        BigInteger factorial= BigInteger.ONE;
        for(int i=1; i<=number; i++){
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            getFactorial(scanner.nextInt());
        }
        scanner.close();
	}
}
