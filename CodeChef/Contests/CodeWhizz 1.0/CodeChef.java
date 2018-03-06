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
        Map<Integer, Integer> singerMap = new Map<>();
        Map<Integer, Integer> listenerMap = new Map<>();
        while(T-->0){
            int S = scanner.nextInt();
            int N = scanner.nextInt();

            while(S-->0){
                singerMap.put(scanner.nextInt(), scanner.nextInt());
            }

            while(N-->0){
                listenerMap.put(scanner.nextInt(), scanner.nextInt());
            }
        }
	}
}
