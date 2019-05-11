import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            stack.push(arr[i]);
        }
        while(n-->0) {
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
        in.close();
    }
}
