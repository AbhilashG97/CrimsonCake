/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef{

	public static void main (String[] args) throws java.lang.Exception{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
		while(T-->0){
			boolean isFrontGloveSmall=false;
			boolean isBackGloveSmall=false; 
			int N = scanner.nextInt();
			int fingerLength[] = new int[N];
			int sheathLength[] = new int[N];

			for(int i=0; i<N; i++){
				//Get finger length
				fingerLength[i] = scanner.nextInt();
			}
			for(int i=0; i<N; i++){
				// Get sheath length
				sheathLength[i] = scanner.nextInt();
			}
			for(int i=0; i<N; i++){
				//Check glove fitting
				if(fingerLength[i]>sheathLength[i]){
					isFrontGloveSmall=true;
				}
				if(fingerLength[i]>sheathLength[(N-1)-i]){
					isBackGloveSmall=true;
				} 
			}

			if(isFrontGloveSmall && isBackGloveSmall){
				System.out.println("none");
			}

            if((isFrontGloveSmall==false) && (isBackGloveSmall==false)){
                System.out.println("both");
            }else if(isFrontGloveSmall==false){
                System.out.println("front");
            }else if(isBackGloveSmall==false){
                System.out.println("back");
            }
		}
	}
}
