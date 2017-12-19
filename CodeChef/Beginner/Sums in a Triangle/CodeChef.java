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
        int sum=0, max=0;
        int[][] arr = new int[99][99];
        while(T-->0){
            int numberOfLines = scanner.nextInt();
            for(int i=0; i<numberOfLines; i++){
                for(int j=0; j<i+1; j++){
                    arr[i][j] = scanner.nextInt();
                }
            }
            for(int i=0; i<numberOfLines; i++){
                for(int j=0; j<i+1; j++){
                    System.out.println(arr[i][j]);
                }
            }
        }
        scanner.close();
	}
}
