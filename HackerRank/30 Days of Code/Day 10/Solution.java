import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        Stack<Integer> binaryNumberStack = new Stack<>();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int quotient = -1, remainder = 0, count = 0, maxCount = 0;

        for(int i=1; quotient!=0; i++) {
            quotient = n/2;
            remainder = n%2;
            binaryNumberStack.push(remainder);
            n = quotient;
        }

        int previousValue = 1;
        
        while(!binaryNumberStack.isEmpty()) {
            int currentValue = binaryNumberStack.pop();
            if(currentValue == 1 && currentValue == previousValue) {
                count++;
                previousValue = currentValue;
            }else {
                if(count > maxCount) {
                    maxCount = count;
                }
                count = 0;
                previousValue = 1;
            }
        }
        
        if(count > maxCount) {
            maxCount = count;
        }

        System.out.println(maxCount);
        
        scanner.close();
    }
}
