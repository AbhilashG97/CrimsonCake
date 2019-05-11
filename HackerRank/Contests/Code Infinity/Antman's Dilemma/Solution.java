import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
        while(t-->0) {
            int N = scanner.nextInt();
            int a = scanner.nextInt(); // Giant Mode
            int b = scanner.nextInt(); // Ant Mode
            int giantSteps = 0, antSteps = 0;
            
            if((N-1)%2==0) {
                giantSteps = (N-1)/2;
                antSteps = N-1;

                if(giantSteps*a < antSteps*b) {
                    System.out.println(giantSteps*a);
                } else {
                    System.out.println(antSteps*b);
                }
            } else {
                // if(a < b) {
                //     giantSteps = (N-2)/2;
                //     antSteps = 1;
                //     System.out.println("a < b :: giant -> "+giantSteps + " ant -> " +antSteps);
                // } else {
                //     giantSteps = 1;
                //     antSteps = N-2;
                //     System.out.println("a > b :: giant -> "+giantSteps + " ant -> " +antSteps);
                // }
                    int sum1 = N-2, sum2 = 1, minResult = 0;
                    int val = N-2/2;
                while(val-->0) {
                    minResult = 0;
                    int result1 = 0, result2 = 0;
                    result1 = (sum1/2)*a + sum2*b;
                    result2 = (sum1)*b + (sum2/2)*a;
                    if(result1 < result2) {
                        minResult = result1;
                    }else {
                        minResult = result2;
                    }                
                    sum1--;
                    sum2--;
                }
                System.out.println(minResult);
            }
        }
		scanner.close();
	}
}
