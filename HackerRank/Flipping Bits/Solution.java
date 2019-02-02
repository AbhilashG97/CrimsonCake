import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flippingBits function below.
    static long flippingBits(long n) {
        StringBuilder binaryString = new StringBuilder(Long.toBinaryString(n).toString());
        if(binaryString.length() < 32) {
            int counter = 32-binaryString.toString().length();
            while(counter-- > 0) {
                binaryString.insert(0, '0');
            }
        } 
        for(int i=0; i<binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') {
                binaryString.setCharAt(i, '0');
            } else {
                binaryString.setCharAt(i, '1');
            }
        }
        return Long.parseLong(binaryString.toString(), 2);
    }

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t-->0) {
            long input = scanner.nextLong();
            System.out.println(flippingBits(input));
        }
        scanner.close();
    }
}
