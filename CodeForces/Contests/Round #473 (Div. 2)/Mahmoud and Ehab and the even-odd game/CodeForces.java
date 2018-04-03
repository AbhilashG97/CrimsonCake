/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeForces {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int turn = 1, aE = 0, aM = 0;
        char winner = 'z';
        while(true) {
            if(turn%2==0) {
                // Ehab's turn
                
                if(n%2==0) {
                    aE = n-1; 
                }else {
                    aE = n;
                }
                
                if(aE < 1) {
                    winner = 'm';
                    break;
                }

                n = n-aE;

            } else {
                // Mohmoud's turn
                if(n%2==0) {
                    aM = n;
                }else {
                    aM = n-1;
                }

                if(aM < 1) {
                    winner = 'e';
                    break;
                }
                n = n-aM;
            }
            turn++;
        }
        if(winner=='e') {
            System.out.println("Ehab");
        } else {
            System.out.println("Mahmoud");
        }
        scanner.close();
	}
}
