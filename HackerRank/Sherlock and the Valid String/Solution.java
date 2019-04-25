import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        String result = "NO";

        int[] count = new int[26];
        int[] frequency = new int[26];

        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 97]++;    
        }

        for(int j=0; j<count.length; j++) {
            if (count[j] != 0) {
                frequency[count[j]]++;
            }
        }

        int numberOfTerms = Arrays.toString(frequency).replaceAll("[0 \\s ,]+", "").length() - 2;

        for(int j=0; j<frequency.length; j++) {
            int term = frequency[1];
        }

        for(int i=0; i<count.length; i++) {
            System.out.print(count[i]+" ");
        }
        System.out.println();

        for(int i=0; i<frequency.length; i++) {
            System.out.print(frequency[i]+" ");
        }
        System.out.println();

        System.out.println(numberOfTerms);

        return result; 
    }

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(isValid(s));

        scanner.close();
    }
}
