/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner scanner= new Scanner(System.in);
        int T = scanner.nextInt();
        int count=0;
        while(T-->0){
            int p = scanner.nextInt();
            for(int i=1; p>=2; i++){
                p=p/2;
                count++;
            }
            System.out.println(count);
            count=0;
        }

        scanner.close();
	}
}
