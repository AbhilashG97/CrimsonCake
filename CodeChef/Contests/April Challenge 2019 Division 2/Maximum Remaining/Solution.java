/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i=0; i<N; i++) { 
		    numbers.add(scanner.nextInt());
		}
		Collections.sort(numbers);
		int maximum = 0;
		
		for(int j=0; j<numbers.size() - 1; j++) {
		   int a = numbers.get(j) % numbers.get(j+1);
		   int b = numbers.get(j+1) % numbers.get(j);
		   
		   if(maximum < a) {
		       maximum = a;
		   } else if (maximum < b){
		       maximum = b;
		   }
		}
		
		System.out.println(maximum);
		
		scanner.close();
	}
}
