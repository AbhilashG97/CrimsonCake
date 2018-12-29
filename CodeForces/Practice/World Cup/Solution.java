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
        int[] totalQueues = new int[n];

        int i = 0; 

        while(n-->0) {
            totalQueues[i] = scanner.nextInt();
            i++;
        }

        int allenPosition = 0;
        
   
        System.out.println(allenPosition+1);

        scanner.close();
    }
}