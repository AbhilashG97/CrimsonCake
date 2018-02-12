/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */


class Codechef{

    private static BigInteger getFactorial(int number){
        BigInteger p = new BigInteger(0);
        for(int i=0; i<number; i++){
            p = p.mutiply(BigInteger.valueOf(i));
        }
        return p;
    }

	public static void main (String[] args) throws java.lang.Exception{
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0){
            int teamFlag = 0; // 0 if teamA, else 1
            String teamA = scanner.next();
            String teamB = scanner.next();
            if(teamA.contains("!") && teamB.contains("!")){
                
            }else{
                if(teamA.contains("!")){
                    
                }else if(teamB.contains("!")){

                }
            }
        }
        scanner.close();
	}
}
