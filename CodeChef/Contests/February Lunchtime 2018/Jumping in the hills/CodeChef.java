/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0){
            int index = 1;
            int N = scanner.nextInt();
            int U = scanner.nextInt();
            int D = scanner.nextInt();
            int[] nArray = new int[N];
            int i = 0;
            while(N-->0){
                nArray[i] = scanner.nextInt();
                i++;
            }
            // for(Integer l : nArray){
            //     System.out.print(l+"");
            // }
            int lowerJumpCounter = 0;
            //System.out.println("\n"+N+" "+nArray.length+"\n");
            for(int j=0; j<nArray.length-1; j++){
                if(nArray[j]<nArray[j+1]){
                    if(Math.abs(nArray[j]-nArray[j+1])<=U){
                        index++;
                    }else{
                        break;
                    }
                }else if(nArray[j]>nArray[j+1]){
                    if(Math.abs(nArray[j]-nArray[j+1])>=D){
                            if(lowerJumpCounter>1){
                                break;
                            }
                        index++;
                        lowerJumpCounter++;
                    }else{
                        break;
                    }
                }else if (nArray[j] == nArray[j+1]){
                    index++;
                }
            }
            System.out.println(index);
        }
        scanner.close();
	}
}
