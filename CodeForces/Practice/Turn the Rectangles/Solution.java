import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main (String[] args) throws java.lang.Exception {
       
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] widthArray = new int[n];
        int[] heightArray = new int[n];
       
        for(int i=0; i< n; i++) {
            widthArray[i] = scanner.nextInt();
            heightArray[i] = scanner.nextInt();
        }
           
        for(int j=1; j<n; j++) {
            if(heightArray[j] > heightArray[j-1]) {
                if(widthArray[j-1] < heightArray[j] && widthArray[j] > heightArray[j-1]) {
                    System.out.println("NO");
                    System.exit(0);
                } else {
                    if(widthArray[j-1] > heightArray[j]) {
                        int temp = widthArray[j-1];
                        widthArray[j-1] = heightArray[j];
                        heightArray[j] = temp;
                    } else {
                        
                    }
                }
            }
        }
        System.out.println("YES");
        scanner.close();
    }
}