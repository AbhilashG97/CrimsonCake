import java.util.Scanner;

public class Solution {
    
    public static void printArray(int[] array) {
        for(Integer i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] mArray = new int[n];
        int max = 1;
        
        for(int i=0; i < n; i++) {
            mArray[i] = scanner.nextInt();
            if(mArray[i] > max) {
                max = mArray[i];
            }
        }

        for(int j=0; j < mArray.length; j++) {

            if(mArray[i] % 2 == 0) {
                
            }

            int numberA = j+1;
            int numberB = j+2;
            
            System.out.println(numberA + " " + numberB);

            for(int k=0; k < mArray.length; k++) {
                if(mArray[k] == numberA) {
                    mArray[k] = numberB;
                }
            }
            printArray(mArray);
            System.out.println(numberB + " " + numberA);

            for(int l=0; l < mArray.length; l++) {
                if(mArray[l] == numberB) {
                    mArray[l] = numberA;
                }
            }
            printArray(mArray);
        }
        printArray(mArray);
        scanner.close();
    }
}