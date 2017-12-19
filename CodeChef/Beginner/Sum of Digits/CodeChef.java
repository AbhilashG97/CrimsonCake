/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{   

    public static int getSumOfDigits(int N){
        int sum = 0;
        int remainder = 0;
        for(int i=0; N>0; i++){
            remainder = N%10;
            sum+=remainder;
            N = N/10;
        }
        return sum;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0){
            int N = scanner.nextInt();
            System.out.println(getSumOfDigits(N));
        }    
        scanner.close();
	}
}
