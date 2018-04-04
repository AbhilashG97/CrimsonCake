import java.util.*;
import java.lang.*;
import java.io.*;

public class CodeForces {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k =scanner.nextInt();
        int[] numberOfTheorems = new int[n];
        int[] behaviourType = new int[n];
        int maxValue = 0, sum = 0;
        int specialPowerLimit = n-k+1;
        int count = 0;

        for(int i=0; i<n; i++) {
            numberOfTheorems[i] = scanner.nextInt();
        }

        for(int j=0; j<n; j++) {
            behaviourType[j] = scanner.nextInt();
        }

        for(int a=0; a<specialPowerLimit; a++) {
            sum = 0;
            if(behaviourType[a] == 0) {
                // sleeping
                for(int y=0; y<k; y++) {
                    if(behaviourType[y+a] == 0) {
                        sum+=numberOfTheorems[y+a];
                        //System.out.println(behaviourType[y+a]+" "+sum);
                    }
                }

                if(maxValue < sum) {
                    maxValue = sum;
                }
            } else {
                //awake 
                count+=numberOfTheorems[a];

            }
        }
        //System.out.println(maxValue+" "+count);
        System.out.println(count+maxValue);

        scanner.close();
	}
}
