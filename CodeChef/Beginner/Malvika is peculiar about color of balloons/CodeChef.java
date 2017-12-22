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
            String s = scanner.next();
            int countA=0, countB=0;
            if(s.contains("a") && s.contains("b")){
                for(int i=0; i<s.length(); i++){
                    if(s.charAt(i) == 'a'){
                        countA++;
                    }else{
                        countB++;
                    }
                }

                if(countA >= countB){
                    System.out.println(countB);
                }else{
                    System.out.println(countA);
                }

            }else{
                System.out.println(0);
            }
        }
        scanner.close();
	}
}
