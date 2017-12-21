/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{   

    public static long getReverseLong(long P){
        StringBuilder builder = new StringBuilder(Long.toString(P));
        return Long.parseLong(builder.reverse().toString());
    }

	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while(N-->0){
            long P = scanner.nextLong();
            int iterations = 1;
            while(true){
                P = P + getReverseLong(P);
                if(P == getReverseLong(P)){
                    break;
                }else{
                    iterations++;
                }  
            }
            System.out.println(iterations+" "+P);
        }
        scanner.close();
	}
}
