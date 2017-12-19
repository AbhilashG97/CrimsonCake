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
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Si = 0, Ti =0; 
        ArrayList<Integer> leadList = new ArrayList<>();
        ArrayList<Integer> winnerList = new ArrayList<>();
        leadList.add(0);
        winnerList.add(0);
        while(N-->0){
            Si += scanner.nextInt();
            Ti += scanner.nextInt();
            
            int L = Math.abs(Si - Ti);
            if(Math.abs(Si - Ti) > leadList.get(leadList.size() - 1)){
                leadList.add(L);
                if(Si > Ti){
                    winnerList.add(1);
                }else{
                    winnerList.add(2);
                }
            }
        }
        System.out.println(winnerList.get(winnerList.size()-1)+" "+leadList.get(leadList.size() -1));    
        scanner.close();
	}
}
