import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Juice {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        Arrays.sort(a);
        Arrays.sort(b);
        
        int sizeA = a.length, sizeB = b.length, x = 1, count = 0, flagA = 0, flagB = 0;
        
        while(x <= 100){
        for(int i=0; i<sizeA; i++){
            if(x % a[i] != 0){
                flagA = 1;
            }else{
            	System.out.println("A -> " +x);
            }
        }
        
        for(int j=0; j<sizeB; j++){
            if(b[j] % x != 0){
                flagB = 1;
            }else{
            	System.out.println("B -> "+x);
            }
        }
        
        if(flagA == 0 && flagB ==0){
            count++;
            }else{
            	x++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
