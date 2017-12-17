/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        float y = scanner.nextFloat();

        if(x%5==0){
            if(((float)x + 0.50f)>y){
                System.out.println(y);
            }else{
                System.out.println(y - ((float)x + 0.50f));
            }
        }else{
            System.out.println(y);
        }
        scanner.close();
	}
}