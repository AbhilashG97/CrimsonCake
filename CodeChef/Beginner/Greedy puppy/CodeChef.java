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
            int K = scanner.nextInt();
            int remainingCoins=0;
            for(int i=1; i<=K; i++){
                remainingCoins = Math.max(remainingCoins, N%i);
            }
            System.out.println(remainingCoins);
        }
        scanner.close();
	}
}
