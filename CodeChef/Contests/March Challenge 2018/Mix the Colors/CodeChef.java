/* package codechef; // don't place package name! */

import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef {

    public static void printArray(int[] array){
        // For debugging 
        for(Integer i : array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

	public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0) {
            int countMixingOperations = 0;
            int N = scanner.nextInt();
            int colorArray[] = new int[N];
            for(int i=0; i<N; i++){
                // Get inputs 
                colorArray[i] = scanner.nextInt();
            }
            Arrays.sort(colorArray);
            int maxElement = colorArray[N-1];
            for(int i=0; i<N-1; i++){
                    if(colorArray[i] == colorArray[i+1]){
                        colorArray[i]+=maxElement;
                        maxElement = colorArray[i];
                        countMixingOperations++;
                        //printArray(colorArray);
                    }
            }
            System.out.println(countMixingOperations);
        }
        scanner.close();
	}
}
