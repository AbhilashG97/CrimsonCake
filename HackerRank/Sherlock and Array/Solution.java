import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {
        String answer = "NO";
        int frontSum = 0, backSum = 0;
        
        if(arr.size() == 1) {
            return "YES";
        } else if (arr.size() == 2) {
            return "NO";
        }

        for(int j=1; j<arr.size(); j++) {
            backSum+=arr.get(j);
        }
        
        for(int i=0; i<arr.size(); i++) {
            if (i == 0) {
                frontSum = 0;
            } else {
                frontSum+=arr.get(i-1);
                backSum-=arr.get(i);
            }
            if(frontSum == backSum) {
                answer = "YES";
                break;
            } 
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> input = null;
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T-->0) {
            input = new ArrayList<>();
            int size = scanner.nextInt();
            for(int i=0; i<size; i++) {
                input.add(scanner.nextInt());
            }
            System.out.println(balancedSums(input));
        }
        scanner.close();
    }
}
