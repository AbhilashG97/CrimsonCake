/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0){
            int N = scanner.nextInt();
            int count = 0;
            String stringNumber = Integer.toString(N);
            for(int i=0; i<stringNumber.length(); i++){
                if(stringNumber.charAt(i) == '4'){
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
	}
}
