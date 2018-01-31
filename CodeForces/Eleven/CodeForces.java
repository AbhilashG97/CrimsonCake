/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeForces{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] charName = new char[n];
        Arrays.fill(charName, 'o');
        int a=0, b=1, c=0;
        
        if(charName.length == 1){
            charName[0] = 'O';
        }else if (charName.length == 2){
            charName[0] = charName[1] = 'O';
        }else{
            charName[0] = charName[1] = 'O';
        }
        for(int i=2; c<=n; i++){
            c=a+b;
            a=b;
            b=c;
            if(c>n){
                break;
            }else{
                charName[c-1] = 'O';
            }
        }
        System.out.println(charName);
        scanner.close();
	}
}
