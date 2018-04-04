import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void printArray(int arr[]) {
        for(Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int lilysHomework(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length-1; i++) {
            int max = 0, maxIndex = 0;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            System.out.println(arr[i]);
            if(arr[i] != arr[maxIndex]) {
                count++;
                System.out.println("Swap - >"+" "+arr[i]+" "+arr[maxIndex]);
            }
            int temp = arr[i];
            arr[i] = max;
            arr[maxIndex] = temp;
            printArray(arr);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = lilysHomework(arr);
        System.out.println(result);
        in.close();
    }
}
